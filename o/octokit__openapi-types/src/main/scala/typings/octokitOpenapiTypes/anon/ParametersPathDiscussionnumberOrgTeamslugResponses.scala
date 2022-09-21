package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslugResponses extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
}
object ParametersPathDiscussionnumberOrgTeamslugResponses {
  
  inline def apply(parameters: PathDiscussionnumberOrgTeamslug): ParametersPathDiscussionnumberOrgTeamslugResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslugResponses]
  }
  
  extension [Self <: ParametersPathDiscussionnumberOrgTeamslugResponses](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
