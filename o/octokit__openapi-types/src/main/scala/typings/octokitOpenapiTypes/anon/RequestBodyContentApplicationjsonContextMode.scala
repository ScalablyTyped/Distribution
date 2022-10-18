package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonContextMode extends StObject {
  
  var requestBody: ContentApplicationjsonContextMode
  
  var responses: `200ContentTexthtml`
}
object RequestBodyContentApplicationjsonContextMode {
  
  inline def apply(requestBody: ContentApplicationjsonContextMode, responses: `200ContentTexthtml`): RequestBodyContentApplicationjsonContextMode = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonContextMode]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonContextMode](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonContextMode): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentTexthtml`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
