package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidUsernameResponses102 extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `102`
}
object ParametersPathTeamidUsernameResponses102 {
  
  inline def apply(parameters: PathTeamidUsername, responses: `102`): ParametersPathTeamidUsernameResponses102 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidUsernameResponses102]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidUsernameResponses102] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `102`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
