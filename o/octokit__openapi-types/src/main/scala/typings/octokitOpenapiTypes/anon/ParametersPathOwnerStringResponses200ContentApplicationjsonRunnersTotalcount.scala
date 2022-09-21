package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringResponses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object ParametersPathOwnerStringResponses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(parameters: PathOwnerString, responses: `200ContentApplicationjsonRunnersTotalcount`): ParametersPathOwnerStringResponses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringResponses200ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: ParametersPathOwnerStringResponses200ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
