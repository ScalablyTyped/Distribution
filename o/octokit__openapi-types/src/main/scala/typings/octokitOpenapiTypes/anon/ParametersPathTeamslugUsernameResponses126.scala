package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugUsernameResponses126 extends StObject {
  
  var parameters: PathTeamslugUsername
  
  var responses: `126`
}
object ParametersPathTeamslugUsernameResponses126 {
  
  inline def apply(parameters: PathTeamslugUsername, responses: `126`): ParametersPathTeamslugUsernameResponses126 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugUsernameResponses126]
  }
  
  extension [Self <: ParametersPathTeamslugUsernameResponses126](x: Self) {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `126`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
