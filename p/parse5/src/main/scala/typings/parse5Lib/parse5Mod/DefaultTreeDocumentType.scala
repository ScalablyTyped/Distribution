package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeDocumentType extends DefaultTreeNode {
  /**
    * Document type name.
    */
  var name: java.lang.String
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentType: parse5Lib.parse5LibStrings.`#documentType`
  /**
    * Document type public identifier.
    */
  var publicId: java.lang.String
  /**
    * Document type system identifier.
    */
  var systemId: java.lang.String
}

object DefaultTreeDocumentType {
  @scala.inline
  def apply(
    name: java.lang.String,
    nodeName: parse5Lib.parse5LibStrings.`#documentType`,
    publicId: java.lang.String,
    systemId: java.lang.String
  ): DefaultTreeDocumentType = {
    val __obj = js.Dynamic.literal(name = name, nodeName = nodeName, publicId = publicId, systemId = systemId)
  
    __obj.asInstanceOf[DefaultTreeDocumentType]
  }
}

