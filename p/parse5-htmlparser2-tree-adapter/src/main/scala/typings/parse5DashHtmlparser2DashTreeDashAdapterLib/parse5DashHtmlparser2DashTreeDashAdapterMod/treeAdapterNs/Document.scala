package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter Document interface.
  */
trait Document extends ParentNode {
  /**
    * The name of the node.
    */
  var name: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.root
  /**
    * The type of the node.
    */
  @JSName("type")
  var type_Document: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.root
  /**
    * [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    */
  var `x-mode`: parse5Lib.parse5Mod.DocumentMode
}

object Document {
  @scala.inline
  def apply(
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    name: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.root,
    next: Node,
    nextSibling: Node,
    nodeType: scala.Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.root,
    `x-mode`: parse5Lib.parse5Mod.DocumentMode
  ): Document = {
    val __obj = js.Dynamic.literal(childNodes = childNodes, children = children, firstChild = firstChild, lastChild = lastChild, name = name, next = next, nextSibling = nextSibling, nodeType = nodeType, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("x-mode")(`x-mode`)
    __obj.asInstanceOf[Document]
  }
}

