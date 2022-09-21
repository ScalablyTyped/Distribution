package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberUsernameStringResponses126 extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var responses: `126`
}
object ParametersPathTeamidNumberUsernameStringResponses126 {
  
  inline def apply(parameters: PathTeamidNumberUsernameString, responses: `126`): ParametersPathTeamidNumberUsernameStringResponses126 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberUsernameStringResponses126]
  }
  
  extension [Self <: ParametersPathTeamidNumberUsernameStringResponses126](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `126`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
