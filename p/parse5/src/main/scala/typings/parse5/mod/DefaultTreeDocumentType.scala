package typings.parse5.mod

import typings.parse5.parse5Strings.NumbersigndocumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeDocumentType extends DefaultTreeNode {
  
  /**
    * Document type name.
    */
  var name: String = js.native
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentType: NumbersigndocumentType = js.native
  
  /**
    * Document type public identifier.
    */
  var publicId: String = js.native
  
  /**
    * Document type system identifier.
    */
  var systemId: String = js.native
}
object DefaultTreeDocumentType {
  
  @scala.inline
  def apply(name: String, nodeName: NumbersigndocumentType, publicId: String, systemId: String): DefaultTreeDocumentType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocumentType]
  }
  
  @scala.inline
  implicit class DefaultTreeDocumentTypeMutableBuilder[Self <: DefaultTreeDocumentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: NumbersigndocumentType): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
  }
}
