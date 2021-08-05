package typings.parse5.mod

import typings.parse5.parse5Strings.NumbersigndocumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTreeDocumentType
  extends StObject
     with DefaultTreeNode {
  
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
  
  inline def apply(name: String, publicId: String, systemId: String): DefaultTreeDocumentType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = "#documentType", publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocumentType]
  }
  
  extension [Self <: DefaultTreeDocumentType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: NumbersigndocumentType): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
  }
}
