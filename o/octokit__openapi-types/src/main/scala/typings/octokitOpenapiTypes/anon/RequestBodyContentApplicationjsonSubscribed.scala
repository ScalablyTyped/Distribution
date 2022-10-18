package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSubscribed extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonSubscribed
  
  var responses: `187`
}
object RequestBodyContentApplicationjsonSubscribed {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonSubscribed, responses: `187`): RequestBodyContentApplicationjsonSubscribed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSubscribed]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSubscribed](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `187`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
