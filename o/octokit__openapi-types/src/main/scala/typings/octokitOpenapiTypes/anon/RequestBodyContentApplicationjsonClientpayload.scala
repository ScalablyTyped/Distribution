package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonClientpayload extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonClientpayload
  
  var responses: `11`
}
object RequestBodyContentApplicationjsonClientpayload {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonClientpayload, responses: `11`): RequestBodyContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonClientpayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonClientpayload] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonClientpayload): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `11`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
