package typings.parse5.mod

import typings.parse5.parse5Strings.NumbersigndocumentType
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
  var nodeName_DefaultTreeDocumentType: NumbersigndocumentType
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
  def apply(name: String, nodeName: NumbersigndocumentType, publicId: String, systemId: String): DefaultTreeDocumentType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultTreeDocumentType]
  }
}

