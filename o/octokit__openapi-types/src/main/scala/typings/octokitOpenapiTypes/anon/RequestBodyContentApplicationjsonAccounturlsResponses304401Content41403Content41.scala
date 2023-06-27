package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAccounturlsResponses304401Content41403Content41 extends StObject {
  
  var requestBody: ContentApplicationjsonAccounturls
  
  var responses: `304401Content41403Content41`
}
object RequestBodyContentApplicationjsonAccounturlsResponses304401Content41403Content41 {
  
  inline def apply(requestBody: ContentApplicationjsonAccounturls, responses: `304401Content41403Content41`): RequestBodyContentApplicationjsonAccounturlsResponses304401Content41403Content41 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAccounturlsResponses304401Content41403Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAccounturlsResponses304401Content41403Content41] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAccounturls): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401Content41403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
