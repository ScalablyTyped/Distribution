package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577Responses200ContentApplicationjsonIncludedminutes extends StObject {
  
  var parameters: Path577
  
  var responses: `200ContentApplicationjsonIncludedminutes`
}
object ParametersPath577Responses200ContentApplicationjsonIncludedminutes {
  
  inline def apply(parameters: Path577, responses: `200ContentApplicationjsonIncludedminutes`): ParametersPath577Responses200ContentApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577Responses200ContentApplicationjsonIncludedminutes]
  }
  
  extension [Self <: ParametersPath577Responses200ContentApplicationjsonIncludedminutes](x: Self) {
    
    inline def setParameters(value: Path577): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedminutes`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
