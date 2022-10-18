package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamslugResponses extends StObject {
  
  var parameters: PathProjectidTeamslug
}
object ParametersPathProjectidTeamslugResponses {
  
  inline def apply(parameters: PathProjectidTeamslug): ParametersPathProjectidTeamslugResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamslugResponses]
  }
  
  extension [Self <: ParametersPathProjectidTeamslugResponses](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
