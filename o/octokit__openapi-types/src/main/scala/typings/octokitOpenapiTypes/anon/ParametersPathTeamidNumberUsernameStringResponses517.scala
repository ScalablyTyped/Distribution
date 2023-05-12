package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberUsernameStringResponses517 extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var responses: `517`
}
object ParametersPathTeamidNumberUsernameStringResponses517 {
  
  inline def apply(parameters: PathTeamidNumberUsernameString, responses: `517`): ParametersPathTeamidNumberUsernameStringResponses517 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberUsernameStringResponses517]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberUsernameStringResponses517] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `517`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
