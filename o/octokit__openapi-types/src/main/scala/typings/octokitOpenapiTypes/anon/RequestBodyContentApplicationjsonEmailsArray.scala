package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmailsArray extends StObject {
  
  var requestBody: ContentApplicationjsonEmailsArray
  
  var responses: `201304401403404`
}
object RequestBodyContentApplicationjsonEmailsArray {
  
  inline def apply(requestBody: ContentApplicationjsonEmailsArray, responses: `201304401403404`): RequestBodyContentApplicationjsonEmailsArray = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmailsArray]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEmailsArray](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmailsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
