package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  var parameters: Path300
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(parameters: Path300, responses: `200ContentApplicationjsonRunnersTotalcount`): ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: ParametersPath300Responses200ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
