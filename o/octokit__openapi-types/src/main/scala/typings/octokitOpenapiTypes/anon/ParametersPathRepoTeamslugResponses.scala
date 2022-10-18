package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTeamslugResponses extends StObject {
  
  var parameters: PathRepoTeamslug
}
object ParametersPathRepoTeamslugResponses {
  
  inline def apply(parameters: PathRepoTeamslug): ParametersPathRepoTeamslugResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTeamslugResponses]
  }
  
  extension [Self <: ParametersPathRepoTeamslugResponses](x: Self) {
    
    inline def setParameters(value: PathRepoTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
