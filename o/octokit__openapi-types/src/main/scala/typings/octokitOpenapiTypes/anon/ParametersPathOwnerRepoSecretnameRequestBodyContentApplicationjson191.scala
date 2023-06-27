package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson191 extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var requestBody: ContentApplicationjson191
  
  var responses: `590`
}
object ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson191 {
  
  inline def apply(parameters: PathOwnerRepoSecretname, requestBody: ContentApplicationjson191, responses: `590`): ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson191 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson191]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjson191] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson191): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
