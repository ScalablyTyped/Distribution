package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAccounturlsResponses158 extends StObject {
  
  var requestBody: ContentApplicationjsonAccounturls
  
  var responses: `158`
}
object RequestBodyContentApplicationjsonAccounturlsResponses158 {
  
  inline def apply(requestBody: ContentApplicationjsonAccounturls, responses: `158`): RequestBodyContentApplicationjsonAccounturlsResponses158 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAccounturlsResponses158]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAccounturlsResponses158] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAccounturls): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `158`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
