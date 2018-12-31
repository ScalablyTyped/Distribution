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

