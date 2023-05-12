package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAccounturlsResponses135 extends StObject {
  
  var requestBody: ContentApplicationjsonAccounturls
  
  var responses: `135`
}
object RequestBodyContentApplicationjsonAccounturlsResponses135 {
  
  inline def apply(requestBody: ContentApplicationjsonAccounturls, responses: `135`): RequestBodyContentApplicationjsonAccounturlsResponses135 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAccounturlsResponses135]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAccounturlsResponses135] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAccounturls): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `135`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
