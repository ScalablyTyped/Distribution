package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDefaultbranch extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonDefaultbranch
  
  var responses: `200307`
}
object RequestBodyContentApplicationjsonDefaultbranch {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonDefaultbranch, responses: `200307`): RequestBodyContentApplicationjsonDefaultbranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDefaultbranch]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDefaultbranch](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDefaultbranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200307`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
