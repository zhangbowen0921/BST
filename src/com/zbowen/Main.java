package com.zbowen;

import com.zbowen.printer.BinaryTrees;
import com.zbowen.tree.BST;
import com.zbowen.tree.BinaryTree.Visitor;

public class Main {

	public static void main(String[] args) {
		int[] arr = {8, 4, 13, 2, 6, 10, 7};
		BST<Integer> bst = new BST<>();
		for (int i = 0; i < arr.length; i++) {
			bst.add(arr[i]);
		}
		
		BinaryTrees.print(bst);
		System.out.println();
		System.out.print("前序：");
		bst.preorder(new Visitor<Integer>() {
			
			@Override
			protected boolean visit(Integer element) {
				System.out.print(element+" ");
				if (element==6) return true;
				return false;
			}
		});
		System.out.print("\n中序：");
		bst.infixorder(new Visitor<Integer>() {
			
			public boolean visit(Integer element) {
				System.out.print(element+" ");
				if (element==6) return true;
				return false;
			}
		});
		System.out.print("\n后序：");
		bst.epilogue(new Visitor<Integer>() {
			
			@Override
			protected boolean visit(Integer element) {
				System.out.print(element+" ");
				if (element==6) return true;
				return false;
			}
		});
		
	}
	
}
