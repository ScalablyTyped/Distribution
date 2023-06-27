package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson456 extends StObject {
  
  var requestBody: ContentApplicationjson456
  
  var responses: `200Content457`
}
object RequestBodyContentApplicationjson456 {
  
  inline def apply(requestBody: ContentApplicationjson456, responses: `200Content457`): RequestBodyContentApplicationjson456 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson456]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson456] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjson456): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content457`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
