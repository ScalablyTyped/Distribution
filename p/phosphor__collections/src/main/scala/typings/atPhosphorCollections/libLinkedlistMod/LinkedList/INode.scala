package typings.atPhosphorCollections.libLinkedlistMod.LinkedList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val list: typings.atPhosphorCollections.libLinkedlistMod.LinkedList[T] | Null
  /**
    * The next node in the list.
    *
    * This will be `null` when the node is the last node in the list
    * or when the node is removed from the list.
    */
  val next: INode[T] | Null
  /**
    * The previous node in the list.
    *
    * This will be `null` when the node is the first node in the list
    * or when the node is removed from the list.
    */
  val prev: INode[T] | Null
  /**
    * The user value stored in the node.
    */
  val value: T
}

object INode {
  @scala.inline
  def apply[T](
    value: T,
    list: typings.atPhosphorCollections.libLinkedlistMod.LinkedList[T] = null,
    next: INode[T] = null,
    prev: INode[T] = null
  ): INode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[INode[T]]
  }
}

