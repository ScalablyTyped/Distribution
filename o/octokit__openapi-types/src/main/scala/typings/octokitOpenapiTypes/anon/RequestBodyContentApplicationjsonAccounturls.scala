package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAccounturls extends StObject {
  
  var requestBody: ContentApplicationjsonAccounturls
  
  var responses: `201477`
}
object RequestBodyContentApplicationjsonAccounturls {
  
  inline def apply(requestBody: ContentApplicationjsonAccounturls, responses: `201477`): RequestBodyContentApplicationjsonAccounturls = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAccounturls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAccounturls] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAccounturls): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201477`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
