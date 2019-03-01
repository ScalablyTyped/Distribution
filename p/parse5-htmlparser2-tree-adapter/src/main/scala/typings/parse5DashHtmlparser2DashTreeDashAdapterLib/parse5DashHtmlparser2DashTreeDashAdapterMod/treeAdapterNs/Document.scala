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
    val __obj = js.Dynamic.literal(`type` = `type`, `x-mode` = `x-mode`)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("firstChild")(firstChild)
    __obj.updateDynamic("lastChild")(lastChild)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("previousSibling")(previousSibling)
    __obj.asInstanceOf[Document]
  }
}

