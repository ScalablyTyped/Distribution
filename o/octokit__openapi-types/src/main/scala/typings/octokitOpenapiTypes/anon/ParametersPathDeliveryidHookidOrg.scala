package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOrg extends StObject {
  
  var parameters: PathDeliveryidHookidOrg
  
  var responses: `200ContentApplicationjsonDeliveredat`
}
object ParametersPathDeliveryidHookidOrg {
  
  inline def apply(parameters: PathDeliveryidHookidOrg, responses: `200ContentApplicationjsonDeliveredat`): ParametersPathDeliveryidHookidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOrg]
  }
  
  extension [Self <: ParametersPathDeliveryidHookidOrg](x: Self) {
    
    inline def setParameters(value: PathDeliveryidHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeliveredat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
