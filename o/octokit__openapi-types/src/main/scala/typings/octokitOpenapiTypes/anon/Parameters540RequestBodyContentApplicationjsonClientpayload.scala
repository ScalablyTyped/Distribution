package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters540RequestBodyContentApplicationjsonClientpayload extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonClientpayload
  
  var responses: `476`
}
object Parameters540RequestBodyContentApplicationjsonClientpayload {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjsonClientpayload, responses: `476`): Parameters540RequestBodyContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters540RequestBodyContentApplicationjsonClientpayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters540RequestBodyContentApplicationjsonClientpayload] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonClientpayload): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `476`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
