package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathWorkflowidQueryChecksuiteid extends StObject {
  
  var parameters: PathWorkflowidQueryChecksuiteid
  
  var responses: `200ContentApplicationjsonWorkflowruns`
}
object ParametersPathWorkflowidQueryChecksuiteid {
  
  inline def apply(parameters: PathWorkflowidQueryChecksuiteid, responses: `200ContentApplicationjsonWorkflowruns`): ParametersPathWorkflowidQueryChecksuiteid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathWorkflowidQueryChecksuiteid]
  }
  
  extension [Self <: ParametersPathWorkflowidQueryChecksuiteid](x: Self) {
    
    inline def setParameters(value: PathWorkflowidQueryChecksuiteid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
