package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmail extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjsonEmail
  
  var responses: `201Content81`
}
object RequestBodyContentApplicationjsonEmail {
  
  inline def apply(parameters: `57`, requestBody: ContentApplicationjsonEmail, responses: `201Content81`): RequestBodyContentApplicationjsonEmail = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEmail] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmail): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content81`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
