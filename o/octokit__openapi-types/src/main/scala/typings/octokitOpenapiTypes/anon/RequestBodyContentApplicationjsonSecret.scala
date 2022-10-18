package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSecret extends StObject {
  
  var requestBody: ContentApplicationjsonSecret
  
  var responses: `200Content229`
}
object RequestBodyContentApplicationjsonSecret {
  
  inline def apply(requestBody: ContentApplicationjsonSecret, responses: `200Content229`): RequestBodyContentApplicationjsonSecret = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSecret]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSecret](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonSecret): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content229`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
