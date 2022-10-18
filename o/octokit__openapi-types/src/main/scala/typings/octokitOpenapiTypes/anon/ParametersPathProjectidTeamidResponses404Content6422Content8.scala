package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamidResponses404Content6422Content8 extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var responses: `404Content6422Content8`
}
object ParametersPathProjectidTeamidResponses404Content6422Content8 {
  
  inline def apply(parameters: PathProjectidTeamid, responses: `404Content6422Content8`): ParametersPathProjectidTeamidResponses404Content6422Content8 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamidResponses404Content6422Content8]
  }
  
  extension [Self <: ParametersPathProjectidTeamidResponses404Content6422Content8](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
