package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters395RequestBodyContentApplicationjsonClientpayload extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonClientpayload
  
  var responses: `239`
}
object Parameters395RequestBodyContentApplicationjsonClientpayload {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonClientpayload, responses: `239`): Parameters395RequestBodyContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters395RequestBodyContentApplicationjsonClientpayload]
  }
  
  extension [Self <: Parameters395RequestBodyContentApplicationjsonClientpayload](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonClientpayload): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `239`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
