package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson359 extends StObject {
  
  var requestBody: ContentApplicationjson359
  
  var responses: `200Content358`
}
object RequestBodyContentApplicationjson359 {
  
  inline def apply(requestBody: ContentApplicationjson359, responses: `200Content358`): RequestBodyContentApplicationjson359 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson359]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson359] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjson359): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content358`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
