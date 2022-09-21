package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonVisibility extends StObject {
  
  var requestBody: ContentApplicationjsonVisibility
  
  var responses: `200Content371`
}
object RequestBodyContentApplicationjsonVisibility {
  
  inline def apply(requestBody: ContentApplicationjsonVisibility, responses: `200Content371`): RequestBodyContentApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonVisibility]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonVisibility](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonVisibility): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content371`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
