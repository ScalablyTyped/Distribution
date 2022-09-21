package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamid extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `200Content114`
}
object ParametersPathTeamid {
  
  inline def apply(parameters: PathTeamid, responses: `200Content114`): ParametersPathTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamid]
  }
  
  extension [Self <: ParametersPathTeamid](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content114`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
