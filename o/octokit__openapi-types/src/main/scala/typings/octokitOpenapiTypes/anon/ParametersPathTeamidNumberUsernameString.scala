package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberUsernameString extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var responses: `404Unknown`
}
object ParametersPathTeamidNumberUsernameString {
  
  inline def apply(parameters: PathTeamidNumberUsernameString, responses: `404Unknown`): ParametersPathTeamidNumberUsernameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberUsernameString]
  }
  
  extension [Self <: ParametersPathTeamidNumberUsernameString](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
