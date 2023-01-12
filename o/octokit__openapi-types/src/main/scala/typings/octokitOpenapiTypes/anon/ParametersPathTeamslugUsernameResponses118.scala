package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugUsernameResponses118 extends StObject {
  
  var parameters: PathTeamslugUsername
  
  var responses: `118`
}
object ParametersPathTeamslugUsernameResponses118 {
  
  inline def apply(parameters: PathTeamslugUsername, responses: `118`): ParametersPathTeamslugUsernameResponses118 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugUsernameResponses118]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugUsernameResponses118] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `118`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
