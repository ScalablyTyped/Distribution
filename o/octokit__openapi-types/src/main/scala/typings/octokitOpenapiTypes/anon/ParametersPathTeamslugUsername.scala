package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugUsername extends StObject {
  
  var parameters: PathTeamslugUsername
  
  var responses: `200ContentApplicationjsonRoleState`
}
object ParametersPathTeamslugUsername {
  
  inline def apply(parameters: PathTeamslugUsername, responses: `200ContentApplicationjsonRoleState`): ParametersPathTeamslugUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugUsername]
  }
  
  extension [Self <: ParametersPathTeamslugUsername](x: Self) {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRoleState`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
