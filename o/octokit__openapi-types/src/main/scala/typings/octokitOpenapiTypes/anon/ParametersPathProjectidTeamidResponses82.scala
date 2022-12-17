package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamidResponses82 extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var responses: `82`
}
object ParametersPathProjectidTeamidResponses82 {
  
  inline def apply(parameters: PathProjectidTeamid, responses: `82`): ParametersPathProjectidTeamidResponses82 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamidResponses82]
  }
  
  extension [Self <: ParametersPathProjectidTeamidResponses82](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `82`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
