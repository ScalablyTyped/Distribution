package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgTeamslug extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var responses: `200ContentApplicationjsonRole`
}
object ParametersPathOrgTeamslug {
  
  inline def apply(parameters: PathOrgTeamslug, responses: `200ContentApplicationjsonRole`): ParametersPathOrgTeamslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgTeamslug]
  }
  
  extension [Self <: ParametersPathOrgTeamslug](x: Self) {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRole`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
