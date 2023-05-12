package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649 extends StObject {
  
  var parameters: Path649
  
  var responses: `403Content36404ContentApplicationjsonDocumentationurlMessage`
}
object ParametersPath649 {
  
  inline def apply(parameters: Path649, responses: `403Content36404ContentApplicationjsonDocumentationurlMessage`): ParametersPath649 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content36404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
