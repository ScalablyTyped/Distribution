package typings
package atPhosphorCollectionsLib.libLinkedlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/collections/lib/linkedlist", "LinkedList")
@js.native
/**
  * Construct a new linked list.
  */
class LinkedList[T] ()
  extends atPhosphorAlgorithmLib.libIterMod.IIterable[T]
     with atPhosphorAlgorithmLib.libRetroMod.IRetroable[T] {
  var _first: js.Any = js.native
  var _last: js.Any = js.native
  var _length: js.Any = js.native
  /**
    * The first value in the list.
    *
    * This is `undefined` if the list is empty.
    *
    * #### Complexity
    * Constant.
    */
  val first: js.UndefOr[T] = js.native
  /**
    * The first node in the list.
    *
    * This is `null` if the list is empty.
    *
    * #### Complexity
    * Constant.
    */
  val firstNode: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] | scala.Null = js.native
  /**
    * Whether the list is empty.
    *
    * #### Complexity
    * Constant.
    */
  val isEmpty: scala.Boolean = js.native
  /**
    * The last value in the list.
    *
    * This is `undefined` if the list is empty.
    *
    * #### Complexity
    * Constant.
    */
  val last: js.UndefOr[T] = js.native
  /**
    * The last node in the list.
    *
    * This is `null` if the list is empty.
    *
    * #### Complexity
    * Constant.
    */
  val lastNode: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] | scala.Null = js.native
  /**
    * The length of the list.
    *
    * #### Complexity
    * Constant.
    */
  val length: scala.Double = js.native
  /**
    * Add a value to the beginning of the list.
    *
    * @param value - The value to add to the beginning of the list.
    *
    * @returns The list node which holds the value.
    *
    * #### Complexity
    * Constant.
    */
  def addFirst(value: T): atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] = js.native
  /**
    * Add a value to the end of the list.
    *
    * @param value - The value to add to the end of the list.
    *
    * @returns The list node which holds the value.
    *
    * #### Complexity
    * Constant.
    */
  def addLast(value: T): atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] = js.native
  /**
    * Remove all values from the list.
    *
    * #### Complexity
    * Linear.
    */
  def clear(): scala.Unit = js.native
  def insertAfter(value: T): atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] = js.native
  /**
    * Insert a value after a specific node in the list.
    *
    * @param value - The value to insert after the reference node.
    *
    * @param ref - The reference node of interest. If this is `null`,
    *   the value will be added to the end of the list.
    *
    * @returns The list node which holds the value.
    *
    * #### Notes
    * The reference node must be owned by the list.
    *
    * #### Complexity
    * Constant.
    */
  def insertAfter(value: T, ref: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]): atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] = js.native
  def insertBefore(value: T): atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] = js.native
  /**
    * Insert a value before a specific node in the list.
    *
    * @param value - The value to insert before the reference node.
    *
    * @param ref - The reference node of interest. If this is `null`,
    *   the value will be added to the beginning of the list.
    *
    * @returns The list node which holds the value.
    *
    * #### Notes
    * The reference node must be owned by the list.
    *
    * #### Complexity
    * Constant.
    */
  def insertBefore(value: T, ref: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]): atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T] = js.native
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
    * Create an iterator over the nodes in the list.
    *
    * @returns A new iterator starting with the first node.
    *
    * #### Complexity
    * Constant.
    */
  def nodes(): atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]] = js.native
  /**
    * Remove and return the value at the beginning of the list.
    *
    * @returns The removed value, or `undefined` if the list is empty.
    *
    * #### Complexity
    * Constant.
    */
  def removeFirst(): js.UndefOr[T] = js.native
  /**
    * Remove and return the value at the end of the list.
    *
    * @returns The removed value, or `undefined` if the list is empty.
    *
    * #### Complexity
    * Constant.
    */
  def removeLast(): js.UndefOr[T] = js.native
  /**
    * Remove a specific node from the list.
    *
    * @param node - The node to remove from the list.
    *
    * #### Complexity
    * Constant.
    *
    * #### Notes
    * The node must be owned by the list.
    */
  def removeNode(node: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]): scala.Unit = js.native
  /**
    * Get a reverse iterator over the object's values.
    *
    * @returns An iterator which yields the object's values in reverse.
    */
  /* CompleteClass */
  override def retro(): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  /**
    * Create a reverse iterator over the nodes in the list.
    *
    * @returns A new iterator starting with the last node.
    *
    * #### Complexity
    * Constant.
    */
  def retroNodes(): atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]] = js.native
}

