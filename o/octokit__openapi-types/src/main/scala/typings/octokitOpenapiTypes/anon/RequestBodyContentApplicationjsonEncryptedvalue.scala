package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEncryptedvalue extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalue
  
  var responses: `201Content67`
}
object RequestBodyContentApplicationjsonEncryptedvalue {
  
  inline def apply(
    parameters: PathSecretname,
    requestBody: ContentApplicationjsonEncryptedvalue,
    responses: `201Content67`
  ): RequestBodyContentApplicationjsonEncryptedvalue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEncryptedvalue]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEncryptedvalue](x: Self) {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content67`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
