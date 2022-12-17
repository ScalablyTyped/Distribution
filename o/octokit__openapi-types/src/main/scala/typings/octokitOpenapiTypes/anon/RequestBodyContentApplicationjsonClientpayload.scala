package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonClientpayload extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonClientpayload
  
  var responses: `8`
}
object RequestBodyContentApplicationjsonClientpayload {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonClientpayload, responses: `8`): RequestBodyContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonClientpayload]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonClientpayload](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonClientpayload): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
