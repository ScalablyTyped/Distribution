package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmailsArrayResponses304Unknown401Content55403Content55 extends StObject {
  
  var requestBody: ContentApplicationjsonEmailsArray
  
  var responses: `304Unknown401Content55403Content55`
}
object RequestBodyContentApplicationjsonEmailsArrayResponses304Unknown401Content55403Content55 {
  
  inline def apply(requestBody: ContentApplicationjsonEmailsArray, responses: `304Unknown401Content55403Content55`): RequestBodyContentApplicationjsonEmailsArrayResponses304Unknown401Content55403Content55 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmailsArrayResponses304Unknown401Content55403Content55]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEmailsArrayResponses304Unknown401Content55403Content55](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmailsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content55403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
