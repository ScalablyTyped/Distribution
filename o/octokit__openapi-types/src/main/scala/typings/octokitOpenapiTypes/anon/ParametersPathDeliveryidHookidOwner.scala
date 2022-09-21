package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOwner extends StObject {
  
  var parameters: PathDeliveryidHookidOwner
  
  var responses: `422`
}
object ParametersPathDeliveryidHookidOwner {
  
  inline def apply(parameters: PathDeliveryidHookidOwner, responses: `422`): ParametersPathDeliveryidHookidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOwner]
  }
  
  extension [Self <: ParametersPathDeliveryidHookidOwner](x: Self) {
    
    inline def setParameters(value: PathDeliveryidHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
