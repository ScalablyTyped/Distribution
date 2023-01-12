package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577 extends StObject {
  
  var parameters: Path577
  
  var responses: `403Content48404ContentApplicationjsonDocumentationurlMessage`
}
object ParametersPath577 {
  
  inline def apply(parameters: Path577, responses: `403Content48404ContentApplicationjsonDocumentationurlMessage`): ParametersPath577 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath577] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path577): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content48404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
