package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson88 extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var requestBody: ContentApplicationjson88
  
  var responses: `323`
}
object ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson88 {
  
  inline def apply(parameters: PathOwnerRepoSecretname, requestBody: ContentApplicationjson88, responses: `323`): ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson88 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson88]
  }
  
  extension [Self <: ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson88](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson88): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `323`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
