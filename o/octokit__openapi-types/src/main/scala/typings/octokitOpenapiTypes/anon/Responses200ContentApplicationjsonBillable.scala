package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBillable extends StObject {
  
  var parameters: `80`
  
  var responses: `200ContentApplicationjsonBillable`
}
object Responses200ContentApplicationjsonBillable {
  
  inline def apply(parameters: `80`, responses: `200ContentApplicationjsonBillable`): Responses200ContentApplicationjsonBillable = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBillable]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBillable](x: Self) {
    
    inline def setParameters(value: `80`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBillable`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
