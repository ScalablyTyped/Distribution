package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberUsernameStringResponses118 extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var responses: `118`
}
object ParametersPathTeamidNumberUsernameStringResponses118 {
  
  inline def apply(parameters: PathTeamidNumberUsernameString, responses: `118`): ParametersPathTeamidNumberUsernameStringResponses118 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberUsernameStringResponses118]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberUsernameStringResponses118] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `118`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
