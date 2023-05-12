package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentificationTypesResponse extends StObject {
  
  var id: String
  
  var max_length: Double
  
  var min_length: Double
  
  var name: String
  
  var `type`: String
}
object IdentificationTypesResponse {
  
  inline def apply(id: String, max_length: Double, min_length: Double, name: String, `type`: String): IdentificationTypesResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], max_length = max_length.asInstanceOf[js.Any], min_length = min_length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentificationTypesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentificationTypesResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMax_length(value: Double): Self = StObject.set(x, "max_length", value.asInstanceOf[js.Any])
    
    inline def setMin_length(value: Double): Self = StObject.set(x, "min_length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
