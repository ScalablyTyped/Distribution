package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslugQuery481 extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslugQuery481
  
  var responses: `200Content482`
}
object ParametersPathDiscussionnumberOrgTeamslugQuery481 {
  
  inline def apply(parameters: PathDiscussionnumberOrgTeamslugQuery481, responses: `200Content482`): ParametersPathDiscussionnumberOrgTeamslugQuery481 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslugQuery481]
  }
  
  extension [Self <: ParametersPathDiscussionnumberOrgTeamslugQuery481](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslugQuery481): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
