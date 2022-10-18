package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBody extends StObject {
  
  var requestBody: ContentApplicationjsonContenttype
  
  var responses: `200ContentApplicationjsonSecret`
}
object RequestBody {
  
  inline def apply(requestBody: ContentApplicationjsonContenttype, responses: `200ContentApplicationjsonSecret`): RequestBody = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBody]
  }
  
  extension [Self <: RequestBody](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonContenttype): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecret`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
