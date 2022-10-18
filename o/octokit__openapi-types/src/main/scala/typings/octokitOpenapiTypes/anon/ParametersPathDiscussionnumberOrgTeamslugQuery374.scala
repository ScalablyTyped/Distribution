package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslugQuery374 extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslugQuery374
  
  var responses: `200Content375`
}
object ParametersPathDiscussionnumberOrgTeamslugQuery374 {
  
  inline def apply(parameters: PathDiscussionnumberOrgTeamslugQuery374, responses: `200Content375`): ParametersPathDiscussionnumberOrgTeamslugQuery374 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslugQuery374]
  }
  
  extension [Self <: ParametersPathDiscussionnumberOrgTeamslugQuery374](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslugQuery374): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content375`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
