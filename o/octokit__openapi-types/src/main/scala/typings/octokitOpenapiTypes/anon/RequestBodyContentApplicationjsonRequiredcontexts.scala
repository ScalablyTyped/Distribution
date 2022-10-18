package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRequiredcontexts extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonRequiredcontexts
  
  var responses: `201202409`
}
object RequestBodyContentApplicationjsonRequiredcontexts {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonRequiredcontexts, responses: `201202409`): RequestBodyContentApplicationjsonRequiredcontexts = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRequiredcontexts]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonRequiredcontexts](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRequiredcontexts): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
