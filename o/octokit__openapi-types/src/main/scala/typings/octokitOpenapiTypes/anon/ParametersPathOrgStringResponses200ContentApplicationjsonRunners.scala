package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonRunners extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonRunners`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonRunners {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonRunners`): ParametersPathOrgStringResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonRunners]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200ContentApplicationjsonRunners](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunners`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
