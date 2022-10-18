package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidUsernameResponses65 extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `65`
}
object ParametersPathTeamidUsernameResponses65 {
  
  inline def apply(parameters: PathTeamidUsername, responses: `65`): ParametersPathTeamidUsernameResponses65 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidUsernameResponses65]
  }
  
  extension [Self <: ParametersPathTeamidUsernameResponses65](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `65`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
