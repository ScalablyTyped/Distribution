package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRequestBodyContentApplicationjsonContenttype extends StObject {
  
  var parameters: PathHookidOwner
  
  var requestBody: ContentApplicationjsonContenttype
  
  var responses: `200Content2`
}
object ParametersPathHookidOwnerRequestBodyContentApplicationjsonContenttype {
  
  inline def apply(
    parameters: PathHookidOwner,
    requestBody: ContentApplicationjsonContenttype,
    responses: `200Content2`
  ): ParametersPathHookidOwnerRequestBodyContentApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRequestBodyContentApplicationjsonContenttype]
  }
  
  extension [Self <: ParametersPathHookidOwnerRequestBodyContentApplicationjsonContenttype](x: Self) {
    
    inline def setParameters(value: PathHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContenttype): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content2`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
