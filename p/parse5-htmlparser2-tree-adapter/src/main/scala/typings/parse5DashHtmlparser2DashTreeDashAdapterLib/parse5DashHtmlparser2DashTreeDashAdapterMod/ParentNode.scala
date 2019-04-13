package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter ParentNode interface.
  */
trait ParentNode extends Node {
  /**
    * Same as {@link children}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var childNodes: js.Array[Node]
  /**
    * Child nodes.
    */
  var children: js.Array[Node]
  /**
    * First child of the node.
    */
  var firstChild: Node
  /**
    * Last child of the node.
    */
  var lastChild: Node
}

object ParentNode {
  @scala.inline
  def apply(
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    next: Node,
    nextSibling: Node,
    nodeType: scala.Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: java.lang.String
  ): ParentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes, children = children, firstChild = firstChild, lastChild = lastChild, next = next, nextSibling = nextSibling, nodeType = nodeType, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ParentNode]
  }
}

