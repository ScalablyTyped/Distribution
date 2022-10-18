package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoTeamid extends StObject {
  
  var parameters: PathOwnerRepoTeamid
  
  var responses: `200Content382`
}
object ParametersPathOwnerRepoTeamid {
  
  inline def apply(parameters: PathOwnerRepoTeamid, responses: `200Content382`): ParametersPathOwnerRepoTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoTeamid]
  }
  
  extension [Self <: ParametersPathOwnerRepoTeamid](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content382`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
