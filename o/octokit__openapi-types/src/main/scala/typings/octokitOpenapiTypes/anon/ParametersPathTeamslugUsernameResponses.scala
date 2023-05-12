package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugUsernameResponses extends StObject {
  
  var parameters: PathTeamslugUsername
}
object ParametersPathTeamslugUsernameResponses {
  
  inline def apply(parameters: PathTeamslugUsername): ParametersPathTeamslugUsernameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugUsernameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugUsernameResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
