package typings.parse5.parse5Mod

import typings.parse5.parse5Strings.`#documentType`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTreeDocumentType extends DefaultTreeNode {
  /**
    * Document type name.
    */
  var name: String
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentType: `#documentType`
  /**
    * Document type public identifier.
    */
  var publicId: String
  /**
    * Document type system identifier.
    */
  var systemId: String
}

object DefaultTreeDocumentType {
  @scala.inline
  def apply(name: String, nodeName: `#documentType`, publicId: String, systemId: String): DefaultTreeDocumentType = {
    val __obj = js.Dynamic.literal(name = name, nodeName = nodeName, publicId = publicId, systemId = systemId)
  
    __obj.asInstanceOf[DefaultTreeDocumentType]
  }
}

