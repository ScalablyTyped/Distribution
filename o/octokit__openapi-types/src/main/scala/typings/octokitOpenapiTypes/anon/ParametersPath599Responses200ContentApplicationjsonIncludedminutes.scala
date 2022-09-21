package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599Responses200ContentApplicationjsonIncludedminutes extends StObject {
  
  var parameters: Path599
  
  var responses: `200ContentApplicationjsonIncludedminutes`
}
object ParametersPath599Responses200ContentApplicationjsonIncludedminutes {
  
  inline def apply(parameters: Path599, responses: `200ContentApplicationjsonIncludedminutes`): ParametersPath599Responses200ContentApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599Responses200ContentApplicationjsonIncludedminutes]
  }
  
  extension [Self <: ParametersPath599Responses200ContentApplicationjsonIncludedminutes](x: Self) {
    
    inline def setParameters(value: Path599): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedminutes`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
