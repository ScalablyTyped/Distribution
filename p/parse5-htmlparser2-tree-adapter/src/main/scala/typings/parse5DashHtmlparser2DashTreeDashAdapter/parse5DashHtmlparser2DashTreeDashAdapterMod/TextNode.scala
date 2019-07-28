package typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterMod

import typings.parse5.parse5Mod.Location
import typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterStrings.text
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
  var data: String
  /**
    * The name of the node.
    */
  var name: text
  /**
    * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var nodeValue: String
  /**
    * Comment source code location info. Available if location info is enabled via ParserOptions.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
}

object TextNode {
  @scala.inline
  def apply(
    data: String,
    name: text,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    nodeValue: String,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: String,
    sourceCodeLocation: Location = null
  ): TextNode = {
    val __obj = js.Dynamic.literal(data = data, name = name, next = next, nextSibling = nextSibling, nodeType = nodeType, nodeValue = nodeValue, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling)
    __obj.updateDynamic("type")(`type`)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[TextNode]
  }
}

