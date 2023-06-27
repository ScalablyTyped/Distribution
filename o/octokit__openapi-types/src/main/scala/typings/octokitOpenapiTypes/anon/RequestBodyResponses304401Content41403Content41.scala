package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyResponses304401Content41403Content41 extends StObject {
  
  var requestBody: js.UndefOr[ContentApplicationjsonEmails] = js.undefined
  
  var responses: `304401Content41403Content41`
}
object RequestBodyResponses304401Content41403Content41 {
  
  inline def apply(responses: `304401Content41403Content41`): RequestBodyResponses304401Content41403Content41 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyResponses304401Content41403Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyResponses304401Content41403Content41] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `304401Content41403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
