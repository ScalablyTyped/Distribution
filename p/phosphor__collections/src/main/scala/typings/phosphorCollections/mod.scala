package typings.phosphorCollections

import typings.phosphorAlgorithm.iterMod.IterableOrArrayLike
import typings.phosphorCollections.linkedlistMod.LinkedList.INode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/collections", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BPlusTree[T] protected ()
    extends typings.phosphorCollections.bplustreeMod.BPlusTree[T] {
    /**
      * Construct a new B+ tree.
      *
      * @param cmp - The item comparison function for the tree.
      */
    def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
  }
  
  @js.native
  /**
    * Construct a new linked list.
    */
  class LinkedList[T] ()
    extends typings.phosphorCollections.linkedlistMod.LinkedList[T]
  
  @js.native
  object BPlusTree extends js.Object {
    /**
      * Create a new B+ tree populated with the given items.
      *
      * @param items - The items to add to the tree.
      *
      * @param cmp - The item comparison function for the tree.
      *
      * @returns A new B+ tree populated with the given items.
      *
      * #### Complexity
      * `O(n log32 n)`
      */
    def from[T](items: IterableOrArrayLike[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): typings.phosphorCollections.bplustreeMod.BPlusTree[T] = js.native
  }
  
  @js.native
  object LinkedList extends js.Object {
    /**
      * A forward iterator for nodes in a linked list.
      */
    @js.native
    class ForwardNodeIterator[T] ()
      extends typings.phosphorCollections.linkedlistMod.LinkedList.ForwardNodeIterator[T] {
      /**
        * Construct a forward node iterator.
        *
        * @param node - The first node in the list.
        */
      def this(node: INode[T]) = this()
    }
    
    /**
      * A forward iterator for values in a linked list.
      */
    @js.native
    class ForwardValueIterator[T] ()
      extends typings.phosphorCollections.linkedlistMod.LinkedList.ForwardValueIterator[T] {
      /**
        * Construct a forward value iterator.
        *
        * @param node - The first node in the list.
        */
      def this(node: INode[T]) = this()
    }
    
    /**
      * A reverse iterator for nodes in a linked list.
      */
    @js.native
    class RetroNodeIterator[T] ()
      extends typings.phosphorCollections.linkedlistMod.LinkedList.RetroNodeIterator[T] {
      /**
        * Construct a retro node iterator.
        *
        * @param node - The last node in the list.
        */
      def this(node: INode[T]) = this()
    }
    
    /**
      * A reverse iterator for values in a linked list.
      */
    @js.native
    class RetroValueIterator[T] ()
      extends typings.phosphorCollections.linkedlistMod.LinkedList.RetroValueIterator[T] {
      /**
        * Construct a retro value iterator.
        *
        * @param node - The last node in the list.
        */
      def this(node: INode[T]) = this()
    }
    
    /**
      * Create a linked list from an iterable of values.
      *
      * @param values - The iterable or array-like object of interest.
      *
      * @returns A new linked list initialized with the given values.
      *
      * #### Complexity
      * Linear.
      */
    def from[T](values: IterableOrArrayLike[T]): typings.phosphorCollections.linkedlistMod.LinkedList[T] = js.native
  }
  
}

