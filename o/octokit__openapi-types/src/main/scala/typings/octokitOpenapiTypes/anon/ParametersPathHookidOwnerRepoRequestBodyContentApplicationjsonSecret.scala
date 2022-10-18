package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var requestBody: ContentApplicationjsonSecret
  
  var responses: `200Content229`
}
object ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret {
  
  inline def apply(
    parameters: PathHookidOwnerRepo,
    requestBody: ContentApplicationjsonSecret,
    responses: `200Content229`
  ): ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret]
  }
  
  extension [Self <: ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret](x: Self) {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSecret): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content229`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
