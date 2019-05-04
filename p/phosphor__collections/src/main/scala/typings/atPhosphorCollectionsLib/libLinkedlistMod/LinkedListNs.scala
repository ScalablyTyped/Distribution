package typings
package atPhosphorCollectionsLib.libLinkedlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/collections/lib/linkedlist", "LinkedList")
@js.native
object LinkedListNs extends js.Object {
  /**
    * A forward iterator for nodes in a linked list.
    */
  @js.native
  class ForwardNodeIterator[T] ()
    extends atPhosphorAlgorithmLib.libIterMod.IIterator[INode[T]] {
    /**
      * Construct a forward node iterator.
      *
      * @param node - The first node in the list.
      */
    def this(node: INode[T]) = this()
    var _node: js.Any = js.native
    /**
      * Get an iterator over the object's values.
      *
      * @returns An iterator which yields the object's values.
      *
      * #### Notes
      * Depending on the iterable, the returned iterator may or may not be
      * a new object. A collection or other container-like object should
      * typically return a new iterator, while an iterator itself should
      * normally return `this`.
      */
    /* CompleteClass */
    override def iter(): atPhosphorAlgorithmLib.libIterMod.IIterator[INode[T]] = js.native
    /**
      * Get the next value from the iterator.
      *
      * @returns The next value from the iterator, or `undefined`.
      *
      * #### Notes
      * The `undefined` value is used to signal the end of iteration and
      * should therefore not be used as a value in a collection.
      *
      * The use of the `undefined` sentinel is an explicit design choice
      * which favors performance over purity. The ES6 iterator design of
      * returning a `{ value, done }` pair is suboptimal, as it requires
      * an object allocation on each iteration; and an `isDone()` method
      * would increase implementation and runtime complexity.
      */
    /* CompleteClass */
    override def next(): js.UndefOr[INode[T]] = js.native
  }
  
  /**
    * A forward iterator for values in a linked list.
    */
  @js.native
  class ForwardValueIterator[T] ()
    extends atPhosphorAlgorithmLib.libIterMod.IIterator[T] {
    /**
      * Construct a forward value iterator.
      *
      * @param node - The first node in the list.
      */
    def this(node: INode[T]) = this()
    var _node: js.Any = js.native
    /**
      * Get an iterator over the object's values.
      *
      * @returns An iterator which yields the object's values.
      *
      * #### Notes
      * Depending on the iterable, the returned iterator may or may not be
      * a new object. A collection or other container-like object should
      * typically return a new iterator, while an iterator itself should
      * normally return `this`.
      */
    /* CompleteClass */
    override def iter(): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
    /**
      * Get the next value from the iterator.
      *
      * @returns The next value from the iterator, or `undefined`.
      *
      * #### Notes
      * The `undefined` value is used to signal the end of iteration and
      * should therefore not be used as a value in a collection.
      *
      * The use of the `undefined` sentinel is an explicit design choice
      * which favors performance over purity. The ES6 iterator design of
      * returning a `{ value, done }` pair is suboptimal, as it requires
      * an object allocation on each iteration; and an `isDone()` method
      * would increase implementation and runtime complexity.
      */
    /* CompleteClass */
    override def next(): js.UndefOr[T] = js.native
  }
  
  /**
    * An object which represents a node in a linked list.
    *
    * #### Notes
    * User code will not create linked list nodes directly. Nodes
    * are created automatically when values are added to a list.
    */
  trait INode[T] extends js.Object {
    /**
      * The linked list which created and owns the node.
      *
      * This will be `null` when the node is removed from the list.
      */
    val list: atPhosphorCollectionsLib.libLinkedlistMod.LinkedList[T] | scala.Null
    /**
      * The next node in the list.
      *
      * This will be `null` when the node is the last node in the list
      * or when the node is removed from the list.
      */
    val next: INode[T] | scala.Null
    /**
      * The previous node in the list.
      *
      * This will be `null` when the node is the first node in the list
      * or when the node is removed from the list.
      */
    val prev: INode[T] | scala.Null
    /**
      * The user value stored in the node.
      */
    val value: T
  }
  
  /**
    * A reverse iterator for nodes in a linked list.
    */
  @js.native
  class RetroNodeIterator[T] ()
    extends atPhosphorAlgorithmLib.libIterMod.IIterator[INode[T]] {
    /**
      * Construct a retro node iterator.
      *
      * @param node - The last node in the list.
      */
    def this(node: INode[T]) = this()
    var _node: js.Any = js.native
    /**
      * Get an iterator over the object's values.
      *
      * @returns An iterator which yields the object's values.
      *
      * #### Notes
      * Depending on the iterable, the returned iterator may or may not be
      * a new object. A collection or other container-like object should
      * typically return a new iterator, while an iterator itself should
      * normally return `this`.
      */
    /* CompleteClass */
    override def iter(): atPhosphorAlgorithmLib.libIterMod.IIterator[INode[T]] = js.native
    /**
      * Get the next value from the iterator.
      *
      * @returns The next value from the iterator, or `undefined`.
      *
      * #### Notes
      * The `undefined` value is used to signal the end of iteration and
      * should therefore not be used as a value in a collection.
      *
      * The use of the `undefined` sentinel is an explicit design choice
      * which favors performance over purity. The ES6 iterator design of
      * returning a `{ value, done }` pair is suboptimal, as it requires
      * an object allocation on each iteration; and an `isDone()` method
      * would increase implementation and runtime complexity.
      */
    /* CompleteClass */
    override def next(): js.UndefOr[INode[T]] = js.native
  }
  
  /**
    * A reverse iterator for values in a linked list.
    */
  @js.native
  class RetroValueIterator[T] ()
    extends atPhosphorAlgorithmLib.libIterMod.IIterator[T] {
    /**
      * Construct a retro value iterator.
      *
      * @param node - The last node in the list.
      */
    def this(node: INode[T]) = this()
    var _node: js.Any = js.native
    /**
      * Get an iterator over the object's values.
      *
      * @returns An iterator which yields the object's values.
      *
      * #### Notes
      * Depending on the iterable, the returned iterator may or may not be
      * a new object. A collection or other container-like object should
      * typically return a new iterator, while an iterator itself should
      * normally return `this`.
      */
    /* CompleteClass */
    override def iter(): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
    /**
      * Get the next value from the iterator.
      *
      * @returns The next value from the iterator, or `undefined`.
      *
      * #### Notes
      * The `undefined` value is used to signal the end of iteration and
      * should therefore not be used as a value in a collection.
      *
      * The use of the `undefined` sentinel is an explicit design choice
      * which favors performance over purity. The ES6 iterator design of
      * returning a `{ value, done }` pair is suboptimal, as it requires
      * an object allocation on each iteration; and an `isDone()` method
      * would increase implementation and runtime complexity.
      */
    /* CompleteClass */
    override def next(): js.UndefOr[T] = js.native
  }
  
  /**
    * Create a linked list from an iterable of values.
    *
    * @param values - The iterable or array-like object of interest.
    *
    * @returns A new linked list initialized with the given values.
    */
  def from[T](values: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]): atPhosphorCollectionsLib.libLinkedlistMod.LinkedList[T] = js.native
}

