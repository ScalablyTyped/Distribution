package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerResponses200Content2 extends StObject {
  
  var parameters: PathHookidOwner
  
  var responses: `200Content2`
}
object ParametersPathHookidOwnerResponses200Content2 {
  
  inline def apply(parameters: PathHookidOwner, responses: `200Content2`): ParametersPathHookidOwnerResponses200Content2 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerResponses200Content2]
  }
  
  extension [Self <: ParametersPathHookidOwnerResponses200Content2](x: Self) {
    
    inline def setParameters(value: PathHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content2`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
