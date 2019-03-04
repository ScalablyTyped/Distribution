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
    val __obj = js.Dynamic.literal(data = data, name = name, next = next, nextSibling = nextSibling, nodeType = nodeType, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("x-name")(`x-name`)
    __obj.updateDynamic("x-publicId")(`x-publicId`)
    __obj.updateDynamic("x-systemId")(`x-systemId`)
    __obj.asInstanceOf[DocumentType]
  }
}

