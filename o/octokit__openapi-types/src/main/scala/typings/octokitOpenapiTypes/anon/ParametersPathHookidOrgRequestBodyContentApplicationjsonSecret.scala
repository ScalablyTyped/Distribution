package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgRequestBodyContentApplicationjsonSecret extends StObject {
  
  var parameters: PathHookidOrg
  
  var requestBody: ContentApplicationjsonSecret
  
  var responses: `200Content229`
}
object ParametersPathHookidOrgRequestBodyContentApplicationjsonSecret {
  
  inline def apply(parameters: PathHookidOrg, requestBody: ContentApplicationjsonSecret, responses: `200Content229`): ParametersPathHookidOrgRequestBodyContentApplicationjsonSecret = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgRequestBodyContentApplicationjsonSecret]
  }
  
  extension [Self <: ParametersPathHookidOrgRequestBodyContentApplicationjsonSecret](x: Self) {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSecret): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content229`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
