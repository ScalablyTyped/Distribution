package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyResponses135 extends StObject {
  
  var requestBody: js.UndefOr[ContentApplicationjsonEmails] = js.undefined
  
  var responses: `135`
}
object RequestBodyResponses135 {
  
  inline def apply(responses: `135`): RequestBodyResponses135 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyResponses135]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyResponses135] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `135`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
