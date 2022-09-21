package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamidResponses90 extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var responses: `90`
}
object ParametersPathProjectidTeamidResponses90 {
  
  inline def apply(parameters: PathProjectidTeamid, responses: `90`): ParametersPathProjectidTeamidResponses90 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamidResponses90]
  }
  
  extension [Self <: ParametersPathProjectidTeamidResponses90](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `90`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
