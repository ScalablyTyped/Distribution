package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content36404ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: `540`
  
  var responses: `403Content36404ContentApplicationjsonDocumentationurlMessage`
}
object Responses403Content36404ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(parameters: `540`, responses: `403Content36404ContentApplicationjsonDocumentationurlMessage`): Responses403Content36404ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content36404ContentApplicationjsonDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content36404ContentApplicationjsonDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content36404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
