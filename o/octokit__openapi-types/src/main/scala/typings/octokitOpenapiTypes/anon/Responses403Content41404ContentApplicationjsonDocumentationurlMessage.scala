package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content41404ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var parameters: `639`
  
  var responses: `403Content41404ContentApplicationjsonDocumentationurlMessage`
}
object Responses403Content41404ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(parameters: `639`, responses: `403Content41404ContentApplicationjsonDocumentationurlMessage`): Responses403Content41404ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content41404ContentApplicationjsonDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content41404ContentApplicationjsonDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content41404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
