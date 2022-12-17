package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: PathCheckrunidOwner
  
  var responses: `403ContentApplicationjsonDocumentationurlMessage`
}
object Responses403ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(parameters: PathCheckrunidOwner, responses: `403ContentApplicationjsonDocumentationurlMessage`): Responses403ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonDocumentationurlMessage]
  }
  
  extension [Self <: Responses403ContentApplicationjsonDocumentationurlMessage](x: Self) {
    
    inline def setParameters(value: PathCheckrunidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
