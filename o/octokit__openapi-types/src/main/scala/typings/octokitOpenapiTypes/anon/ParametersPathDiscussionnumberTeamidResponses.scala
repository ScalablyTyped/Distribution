package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidResponses extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
}
object ParametersPathDiscussionnumberTeamidResponses {
  
  inline def apply(parameters: PathDiscussionnumberTeamid): ParametersPathDiscussionnumberTeamidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidResponses]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamidResponses](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
