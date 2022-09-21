package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTeamidResponses extends StObject {
  
  var parameters: PathRepoTeamid
}
object ParametersPathRepoTeamidResponses {
  
  inline def apply(parameters: PathRepoTeamid): ParametersPathRepoTeamidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTeamidResponses]
  }
  
  extension [Self <: ParametersPathRepoTeamidResponses](x: Self) {
    
    inline def setParameters(value: PathRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
