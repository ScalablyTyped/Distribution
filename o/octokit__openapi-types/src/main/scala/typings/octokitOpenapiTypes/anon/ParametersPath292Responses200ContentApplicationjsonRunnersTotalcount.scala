package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  var parameters: Path292
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(parameters: Path292, responses: `200ContentApplicationjsonRunnersTotalcount`): ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: ParametersPath292Responses200ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setParameters(value: Path292): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
