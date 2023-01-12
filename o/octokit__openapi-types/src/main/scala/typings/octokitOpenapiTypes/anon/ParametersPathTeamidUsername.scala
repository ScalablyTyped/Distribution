package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidUsername extends StObject {
  
  var parameters: PathTeamidUsername
  
  var responses: `404Unknown`
}
object ParametersPathTeamidUsername {
  
  inline def apply(parameters: PathTeamidUsername, responses: `404Unknown`): ParametersPathTeamidUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
