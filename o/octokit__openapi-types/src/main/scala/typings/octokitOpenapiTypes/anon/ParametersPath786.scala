package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath786 extends StObject {
  
  var parameters: Path786
  
  var responses: `403Content41404ContentApplicationjsonDocumentationurlMessage`
}
object ParametersPath786 {
  
  inline def apply(parameters: Path786, responses: `403Content41404ContentApplicationjsonDocumentationurlMessage`): ParametersPath786 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath786]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath786] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content41404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
