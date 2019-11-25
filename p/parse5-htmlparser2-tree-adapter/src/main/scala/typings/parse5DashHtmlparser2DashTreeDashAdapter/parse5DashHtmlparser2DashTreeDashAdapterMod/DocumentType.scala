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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-name")(`x-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-publicId")(`x-publicId`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-systemId")(`x-systemId`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentType]
  }
}

