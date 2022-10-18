package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugUsernameResponses65 extends StObject {
  
  var parameters: PathTeamslugUsername
  
  var responses: `65`
}
object ParametersPathTeamslugUsernameResponses65 {
  
  inline def apply(parameters: PathTeamslugUsername, responses: `65`): ParametersPathTeamslugUsernameResponses65 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugUsernameResponses65]
  }
  
  extension [Self <: ParametersPathTeamslugUsernameResponses65](x: Self) {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `65`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
