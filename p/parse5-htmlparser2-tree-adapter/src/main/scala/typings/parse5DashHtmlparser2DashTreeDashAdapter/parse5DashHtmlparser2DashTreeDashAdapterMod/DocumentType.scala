package typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterMod

import typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterStrings.`!doctype`
import typings.parse5DashHtmlparser2DashTreeDashAdapter.parse5DashHtmlparser2DashTreeDashAdapterStrings.directive
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
  var data: String
  /**
    * Node name.
    */
  var name: `!doctype`
  /**
    * The type of the node.
    */
  @JSName("type")
  var type_DocumentType: directive
  /**
    * Document type name.
    */
  var `x-name`: String
  /**
    * Document type public identifier.
    */
  var `x-publicId`: String
  /**
    * Document type system identifier.
    */
  var `x-systemId`: String
}

object DocumentType {
  @scala.inline
  def apply(
    data: String,
    name: `!doctype`,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: directive,
    `x-name`: String,
    `x-publicId`: String,
    `x-systemId`: String
  ): DocumentType = {
    val __obj = js.Dynamic.literal(data = data, name = name, next = next, nextSibling = nextSibling, nodeType = nodeType, parent = parent, parentNode = parentNode, prev = prev, previousSibling = previousSibling)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("x-name")(`x-name`)
    __obj.updateDynamic("x-publicId")(`x-publicId`)
    __obj.updateDynamic("x-systemId")(`x-systemId`)
    __obj.asInstanceOf[DocumentType]
  }
}

