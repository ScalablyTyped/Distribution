package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson163 extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var requestBody: ContentApplicationjson163
  
  var responses: `506`
}
object ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson163 {
  
  inline def apply(parameters: PathOwnerRepoSecretname, requestBody: ContentApplicationjson163, responses: `506`): ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson163 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson163]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson163] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson163): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `506`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
