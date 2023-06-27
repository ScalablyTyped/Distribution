package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEncryptedvalueKeyid extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalueKeyid
  
  var responses: `201Content63`
}
object RequestBodyContentApplicationjsonEncryptedvalueKeyid {
  
  inline def apply(
    parameters: PathSecretname,
    requestBody: ContentApplicationjsonEncryptedvalueKeyid,
    responses: `201Content63`
  ): RequestBodyContentApplicationjsonEncryptedvalueKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEncryptedvalueKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEncryptedvalueKeyid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content63`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
