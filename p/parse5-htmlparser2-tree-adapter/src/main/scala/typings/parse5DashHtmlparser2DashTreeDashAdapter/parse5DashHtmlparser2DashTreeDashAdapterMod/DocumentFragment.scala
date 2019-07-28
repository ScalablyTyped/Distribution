package typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterMod

import typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter DocumentFragment interface.
  */
trait DocumentFragment extends ParentNode {
  /**
    * The name of the node.
    */
  var name: root
  /**
    * The type of the node.
    */
  @JSName("type")
  var type_DocumentFragment: root
}

object DocumentFragment {
  @scala.inline
  def apply(
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    name: root,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: root
  ): DocumentFragment = {
    val __obj = js.Dynamic.literal(childNodes = childNodes, children = children, firstChild = firstChild, lastChild = lastChild, name = name, next = next, nextSibling = nextSibling, nodeType = nodeType, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentFragment]
  }
}

