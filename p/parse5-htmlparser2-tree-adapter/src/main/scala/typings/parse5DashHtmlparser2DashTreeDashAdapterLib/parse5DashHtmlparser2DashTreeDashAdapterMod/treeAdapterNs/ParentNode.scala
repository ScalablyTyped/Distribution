package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("firstChild")(firstChild)
    __obj.updateDynamic("lastChild")(lastChild)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("previousSibling")(previousSibling)
    __obj.asInstanceOf[ParentNode]
  }
}

