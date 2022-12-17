package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslug extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object ParametersPathDiscussionnumberOrgTeamslug {
  
  inline def apply(parameters: PathDiscussionnumberOrgTeamslug, responses: `200ContentApplicationjsonCommentscount`): ParametersPathDiscussionnumberOrgTeamslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslug]
  }
  
  extension [Self <: ParametersPathDiscussionnumberOrgTeamslug](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
