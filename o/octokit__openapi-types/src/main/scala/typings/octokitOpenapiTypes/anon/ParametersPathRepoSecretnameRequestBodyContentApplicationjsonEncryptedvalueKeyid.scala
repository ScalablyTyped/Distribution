package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid extends StObject {
  
  var parameters: PathRepoSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalueKeyid
  
  var responses: `178`
}
object ParametersPathRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid {
  
  inline def apply(
    parameters: PathRepoSecretname,
    requestBody: ContentApplicationjsonEncryptedvalueKeyid,
    responses: `178`
  ): ParametersPathRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid]
  }
  
  extension [Self <: ParametersPathRepoSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid](x: Self) {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `178`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
