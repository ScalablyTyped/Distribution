package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonHireable extends StObject {
  
  var requestBody: ContentApplicationjsonHireable
  
  var responses: `200ContentApplicationjsonBusinessplus`
}
object RequestBodyContentApplicationjsonHireable {
  
  inline def apply(requestBody: ContentApplicationjsonHireable, responses: `200ContentApplicationjsonBusinessplus`): RequestBodyContentApplicationjsonHireable = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonHireable]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonHireable](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonHireable): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBusinessplus`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
