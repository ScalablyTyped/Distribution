package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAutomerge extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonAutomerge
  
  var responses: `201202409`
}
object RequestBodyContentApplicationjsonAutomerge {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonAutomerge, responses: `201202409`): RequestBodyContentApplicationjsonAutomerge = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAutomerge]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAutomerge](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutomerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
