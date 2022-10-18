package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids extends StObject {
  
  var parameters: PathSecretnameString
  
  var requestBody: ContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids
  
  var responses: `201404`
}
object RequestBodyContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: PathSecretnameString,
    requestBody: ContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids,
    responses: `201404`
  ): RequestBodyContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
