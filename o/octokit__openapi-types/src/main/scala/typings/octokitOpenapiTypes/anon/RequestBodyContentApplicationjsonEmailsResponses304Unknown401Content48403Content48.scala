package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmailsResponses304Unknown401Content48403Content48 extends StObject {
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `304Unknown401Content48403Content48`
}
object RequestBodyContentApplicationjsonEmailsResponses304Unknown401Content48403Content48 {
  
  inline def apply(requestBody: ContentApplicationjsonEmails, responses: `304Unknown401Content48403Content48`): RequestBodyContentApplicationjsonEmailsResponses304Unknown401Content48403Content48 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmailsResponses304Unknown401Content48403Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEmailsResponses304Unknown401Content48403Content48] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content48403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
