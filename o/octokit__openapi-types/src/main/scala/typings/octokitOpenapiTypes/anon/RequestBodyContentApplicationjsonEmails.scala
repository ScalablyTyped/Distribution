package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmails extends StObject {
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `201304401403404`
}
object RequestBodyContentApplicationjsonEmails {
  
  inline def apply(requestBody: ContentApplicationjsonEmails, responses: `201304401403404`): RequestBodyContentApplicationjsonEmails = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEmails] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
