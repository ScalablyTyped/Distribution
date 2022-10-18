package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: PathProjectidTeamslug
  
  var requestBody: Content68
  
  var responses: `403ContentApplicationjsonDocumentationurlMessage`
}
object Responses403ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(
    parameters: PathProjectidTeamslug,
    requestBody: Content68,
    responses: `403ContentApplicationjsonDocumentationurlMessage`
  ): Responses403ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonDocumentationurlMessage]
  }
  
  extension [Self <: Responses403ContentApplicationjsonDocumentationurlMessage](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content68): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
