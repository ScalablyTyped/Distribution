package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOwnerResponses202 extends StObject {
  
  var parameters: PathDeliveryidHookidOwner
  
  var responses: `202`
}
object ParametersPathDeliveryidHookidOwnerResponses202 {
  
  inline def apply(parameters: PathDeliveryidHookidOwner, responses: `202`): ParametersPathDeliveryidHookidOwnerResponses202 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOwnerResponses202]
  }
  
  extension [Self <: ParametersPathDeliveryidHookidOwnerResponses202](x: Self) {
    
    inline def setParameters(value: PathDeliveryidHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
