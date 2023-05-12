package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait documentSelectionType extends StObject {
  
  var config: Any
  
  var document_type: String
  
  var id: String
  
  var issuing_country: String
}
object documentSelectionType {
  
  inline def apply(config: Any, document_type: String, id: String, issuing_country: String): documentSelectionType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], document_type = document_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuing_country = issuing_country.asInstanceOf[js.Any])
    __obj.asInstanceOf[documentSelectionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: documentSelectionType] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDocument_type(value: String): Self = StObject.set(x, "document_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssuing_country(value: String): Self = StObject.set(x, "issuing_country", value.asInstanceOf[js.Any])
  }
}
