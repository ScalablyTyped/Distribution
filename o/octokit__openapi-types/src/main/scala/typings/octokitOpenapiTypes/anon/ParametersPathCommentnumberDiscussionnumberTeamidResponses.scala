package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidResponses extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamid
}
object ParametersPathCommentnumberDiscussionnumberTeamidResponses {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberTeamid): ParametersPathCommentnumberDiscussionnumberTeamidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidResponses]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberTeamidResponses](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
