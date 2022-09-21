package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonReadonly extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonReadonly
  
  var responses: `201Content278`
}
object RequestBodyContentApplicationjsonReadonly {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonReadonly, responses: `201Content278`): RequestBodyContentApplicationjsonReadonly = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonReadonly]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonReadonly](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReadonly): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content278`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
