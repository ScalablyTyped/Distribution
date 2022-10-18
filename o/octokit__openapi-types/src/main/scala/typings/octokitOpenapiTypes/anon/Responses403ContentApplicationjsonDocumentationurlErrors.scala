package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonDocumentationurlErrors extends StObject {
  
  var parameters: PathCardid
  
  var responses: `403ContentApplicationjsonDocumentationurlErrors`
}
object Responses403ContentApplicationjsonDocumentationurlErrors {
  
  inline def apply(parameters: PathCardid, responses: `403ContentApplicationjsonDocumentationurlErrors`): Responses403ContentApplicationjsonDocumentationurlErrors = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonDocumentationurlErrors]
  }
  
  extension [Self <: Responses403ContentApplicationjsonDocumentationurlErrors](x: Self) {
    
    inline def setParameters(value: PathCardid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurlErrors`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
