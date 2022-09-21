package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamid extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamid
  
  var responses: `200ContentApplicationjsonLasteditedat`
}
object ParametersPathCommentnumberDiscussionnumberTeamid {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberTeamid,
    responses: `200ContentApplicationjsonLasteditedat`
  ): ParametersPathCommentnumberDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamid]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberTeamid](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLasteditedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
