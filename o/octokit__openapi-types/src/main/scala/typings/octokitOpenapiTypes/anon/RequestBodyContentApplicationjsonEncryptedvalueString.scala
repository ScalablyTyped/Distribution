package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEncryptedvalueString extends StObject {
  
  var parameters: PathRepositoryidSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalueString
  
  var responses: `201Content60`
}
object RequestBodyContentApplicationjsonEncryptedvalueString {
  
  inline def apply(
    parameters: PathRepositoryidSecretname,
    requestBody: ContentApplicationjsonEncryptedvalueString,
    responses: `201Content60`
  ): RequestBodyContentApplicationjsonEncryptedvalueString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEncryptedvalueString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEncryptedvalueString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content60`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
