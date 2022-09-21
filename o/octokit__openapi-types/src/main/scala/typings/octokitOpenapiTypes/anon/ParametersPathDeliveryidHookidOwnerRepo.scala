package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOwnerRepo extends StObject {
  
  var parameters: PathDeliveryidHookidOwnerRepo
  
  var responses: `200ContentApplicationjsonDeliveredat`
}
object ParametersPathDeliveryidHookidOwnerRepo {
  
  inline def apply(parameters: PathDeliveryidHookidOwnerRepo, responses: `200ContentApplicationjsonDeliveredat`): ParametersPathDeliveryidHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOwnerRepo]
  }
  
  extension [Self <: ParametersPathDeliveryidHookidOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathDeliveryidHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeliveredat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
