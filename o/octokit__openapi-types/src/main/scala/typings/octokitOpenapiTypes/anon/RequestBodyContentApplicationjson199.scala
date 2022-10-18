package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson199 extends StObject {
  
  var requestBody: ContentApplicationjson199
  
  var responses: `200Content198`
}
object RequestBodyContentApplicationjson199 {
  
  inline def apply(requestBody: ContentApplicationjson199, responses: `200Content198`): RequestBodyContentApplicationjson199 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson199]
  }
  
  extension [Self <: RequestBodyContentApplicationjson199](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjson199): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content198`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
