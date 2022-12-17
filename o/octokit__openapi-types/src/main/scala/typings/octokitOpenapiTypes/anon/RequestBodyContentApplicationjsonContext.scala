package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonContext extends StObject {
  
  var requestBody: ContentApplicationjsonContext
  
  var responses: `200ContentTexthtml`
}
object RequestBodyContentApplicationjsonContext {
  
  inline def apply(requestBody: ContentApplicationjsonContext, responses: `200ContentTexthtml`): RequestBodyContentApplicationjsonContext = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonContext]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonContext](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonContext): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentTexthtml`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
