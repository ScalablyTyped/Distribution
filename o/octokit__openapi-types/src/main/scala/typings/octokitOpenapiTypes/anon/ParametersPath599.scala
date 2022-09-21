package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599 extends StObject {
  
  var parameters: Path599
  
  var responses: `403Content55404ContentApplicationjsonDocumentationurlMessage`
}
object ParametersPath599 {
  
  inline def apply(parameters: Path599, responses: `403Content55404ContentApplicationjsonDocumentationurlMessage`): ParametersPath599 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599]
  }
  
  extension [Self <: ParametersPath599](x: Self) {
    
    inline def setParameters(value: Path599): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content55404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
