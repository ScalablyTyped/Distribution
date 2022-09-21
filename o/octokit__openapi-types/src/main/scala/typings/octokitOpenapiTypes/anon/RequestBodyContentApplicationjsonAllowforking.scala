package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowforking extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonAllowforking
  
  var responses: `200307`
}
object RequestBodyContentApplicationjsonAllowforking {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonAllowforking, responses: `200307`): RequestBodyContentApplicationjsonAllowforking = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowforking]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAllowforking](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowforking): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200307`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
