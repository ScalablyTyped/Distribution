package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter TextNode interface.
  */
trait TextNode extends Node {
  /**
    * Text content.
    */
  var data: java.lang.String
  /**
    * The name of the node.
    */
  var name: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.text
  /**
    * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var nodeValue: java.lang.String
  /**
    * Comment source code location info. Available if location info is enabled via ParserOptions.
    */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.Location] = js.undefined
}

object TextNode {
  @scala.inline
  def apply(
    data: java.lang.String,
    name: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.text,
    next: Node,
    nextSibling: Node,
    nodeType: scala.Double,
    nodeValue: java.lang.String,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: java.lang.String,
    sourceCodeLocation: parse5Lib.parse5Mod.Location = null
  ): TextNode = {
    val __obj = js.Dynamic.literal(data = data, name = name, next = next, nextSibling = nextSibling, nodeType = nodeType, nodeValue = nodeValue, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling)
    __obj.updateDynamic("type")(`type`)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[TextNode]
  }
}

