package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamid extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var responses: `200Content109`
}
object ParametersPathDiscussionnumberTeamid {
  
  inline def apply(parameters: PathDiscussionnumberTeamid, responses: `200Content109`): ParametersPathDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamid]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamid](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content109`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
