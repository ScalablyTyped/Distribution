package typings
package parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterMod.treeAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter DocumentType interface.
  */
trait DocumentType extends Node {
  /**
    * Serialized doctype {@link name}, {@link publicId} and {@link systemId}.
    */
  var data: java.lang.String
  /**
    * Node name.
    */
  var name: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.`!doctype`
  /**
    * The type of the node.
    */
  @JSName("type")
  var type_DocumentType: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.directive
  /**
    * Document type name.
    */
  var `x-name`: java.lang.String
  /**
    * Document type public identifier.
    */
  var `x-publicId`: java.lang.String
  /**
    * Document type system identifier.
    */
  var `x-systemId`: java.lang.String
}

object DocumentType {
  @scala.inline
  def apply(
    data: java.lang.String,
    name: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.`!doctype`,
    next: Node,
    nextSibling: Node,
    nodeType: scala.Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: parse5DashHtmlparser2DashTreeDashAdapterLib.parse5DashHtmlparser2DashTreeDashAdapterLibStrings.directive,
    `x-name`: java.lang.String,
    `x-publicId`: java.lang.String,
    `x-systemId`: java.lang.String
  ): DocumentType = {
    val __obj = js.Dynamic.literal(`type` = `type`, `x-name` = `x-name`, `x-publicId` = `x-publicId`, `x-systemId` = `x-systemId`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("previousSibling")(previousSibling)
    __obj.asInstanceOf[DocumentType]
  }
}

