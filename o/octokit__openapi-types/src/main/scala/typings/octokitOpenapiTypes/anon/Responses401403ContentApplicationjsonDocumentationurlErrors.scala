package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403ContentApplicationjsonDocumentationurlErrors extends StObject {
  
  var parameters: Path384
  
  var responses: `401403ContentApplicationjsonDocumentationurlErrors`
}
object Responses401403ContentApplicationjsonDocumentationurlErrors {
  
  inline def apply(parameters: Path384, responses: `401403ContentApplicationjsonDocumentationurlErrors`): Responses401403ContentApplicationjsonDocumentationurlErrors = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403ContentApplicationjsonDocumentationurlErrors]
  }
  
  extension [Self <: Responses401403ContentApplicationjsonDocumentationurlErrors](x: Self) {
    
    inline def setParameters(value: Path384): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403ContentApplicationjsonDocumentationurlErrors`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
