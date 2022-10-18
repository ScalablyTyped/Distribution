package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmailsResponses391 extends StObject {
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `391`
}
object RequestBodyContentApplicationjsonEmailsResponses391 {
  
  inline def apply(requestBody: ContentApplicationjsonEmails, responses: `391`): RequestBodyContentApplicationjsonEmailsResponses391 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmailsResponses391]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEmailsResponses391](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `391`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
