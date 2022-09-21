package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidUsernameResponses126 extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `126`
}
object ParametersPathTeamidUsernameResponses126 {
  
  inline def apply(parameters: PathTeamidUsername, responses: `126`): ParametersPathTeamidUsernameResponses126 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidUsernameResponses126]
  }
  
  extension [Self <: ParametersPathTeamidUsernameResponses126](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `126`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
