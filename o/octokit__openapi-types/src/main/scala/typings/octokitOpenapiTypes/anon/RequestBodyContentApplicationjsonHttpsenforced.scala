package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonHttpsenforced extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonHttpsenforced
  
  var responses: `400409`
}
object RequestBodyContentApplicationjsonHttpsenforced {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonHttpsenforced, responses: `400409`): RequestBodyContentApplicationjsonHttpsenforced = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonHttpsenforced]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonHttpsenforced](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonHttpsenforced): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
