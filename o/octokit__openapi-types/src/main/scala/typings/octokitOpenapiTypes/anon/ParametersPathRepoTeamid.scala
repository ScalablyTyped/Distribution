package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTeamid extends StObject {
  
  var parameters: PathRepoTeamid
  
  var responses: `200Content130`
}
object ParametersPathRepoTeamid {
  
  inline def apply(parameters: PathRepoTeamid, responses: `200Content130`): ParametersPathRepoTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTeamid]
  }
  
  extension [Self <: ParametersPathRepoTeamid](x: Self) {
    
    inline def setParameters(value: PathRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content130`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
