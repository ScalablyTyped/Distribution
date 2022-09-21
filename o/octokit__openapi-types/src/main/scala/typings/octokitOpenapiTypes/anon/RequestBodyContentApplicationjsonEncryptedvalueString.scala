package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEncryptedvalueString extends StObject {
  
  var parameters: PathEnvironmentnameRepositoryidSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalueString
  
  var responses: `201Content67`
}
object RequestBodyContentApplicationjsonEncryptedvalueString {
  
  inline def apply(
    parameters: PathEnvironmentnameRepositoryidSecretname,
    requestBody: ContentApplicationjsonEncryptedvalueString,
    responses: `201Content67`
  ): RequestBodyContentApplicationjsonEncryptedvalueString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEncryptedvalueString]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEncryptedvalueString](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content67`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
