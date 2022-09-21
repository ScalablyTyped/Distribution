package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters491RequestBodyContentApplicationjsonClientpayload extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonClientpayload
  
  var responses: `422Content421`
}
object Parameters491RequestBodyContentApplicationjsonClientpayload {
  
  inline def apply(parameters: `491`, requestBody: ContentApplicationjsonClientpayload, responses: `422Content421`): Parameters491RequestBodyContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters491RequestBodyContentApplicationjsonClientpayload]
  }
  
  extension [Self <: Parameters491RequestBodyContentApplicationjsonClientpayload](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonClientpayload): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
