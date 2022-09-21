package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidNumber extends StObject {
  
  var parameters: PathDeliveryidNumber
  
  var responses: `200ContentApplicationjsonDeliveredat`
}
object ParametersPathDeliveryidNumber {
  
  inline def apply(parameters: PathDeliveryidNumber, responses: `200ContentApplicationjsonDeliveredat`): ParametersPathDeliveryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidNumber]
  }
  
  extension [Self <: ParametersPathDeliveryidNumber](x: Self) {
    
    inline def setParameters(value: PathDeliveryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeliveredat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
