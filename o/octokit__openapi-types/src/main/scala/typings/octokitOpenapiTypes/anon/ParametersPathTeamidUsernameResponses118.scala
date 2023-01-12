package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidUsernameResponses118 extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `118`
}
object ParametersPathTeamidUsernameResponses118 {
  
  inline def apply(parameters: PathTeamidUsername, responses: `118`): ParametersPathTeamidUsernameResponses118 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidUsernameResponses118]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidUsernameResponses118] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `118`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
