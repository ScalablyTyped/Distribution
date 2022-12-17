package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalueKeyid
  
  var responses: `178`
}
object ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid {
  
  inline def apply(
    parameters: PathOwnerRepoSecretname,
    requestBody: ContentApplicationjsonEncryptedvalueKeyid,
    responses: `178`
  ): ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid]
  }
  
  extension [Self <: ParametersPathOwnerRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `178`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
