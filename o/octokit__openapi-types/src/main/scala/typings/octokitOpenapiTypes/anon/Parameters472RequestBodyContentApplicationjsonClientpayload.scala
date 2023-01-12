package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters472RequestBodyContentApplicationjsonClientpayload extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonClientpayload
  
  var responses: `422Content397`
}
object Parameters472RequestBodyContentApplicationjsonClientpayload {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonClientpayload, responses: `422Content397`): Parameters472RequestBodyContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters472RequestBodyContentApplicationjsonClientpayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters472RequestBodyContentApplicationjsonClientpayload] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonClientpayload): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
