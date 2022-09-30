package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentResponse extends StObject {
  
  var id: String
  
  var side: String
  
  var `type`: DocumentTypes
  
  var variant: RequestedVariant
}
object DocumentResponse {
  
  inline def apply(id: String, side: String, `type`: DocumentTypes, variant: RequestedVariant): DocumentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponse]
  }
  
  extension [Self <: DocumentResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setType(value: DocumentTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: RequestedVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
