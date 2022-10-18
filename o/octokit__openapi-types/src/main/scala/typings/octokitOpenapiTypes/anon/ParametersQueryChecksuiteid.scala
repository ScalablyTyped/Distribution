package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryChecksuiteid extends StObject {
  
  var parameters: QueryChecksuiteid
  
  var responses: `200ContentApplicationjsonWorkflowruns`
}
object ParametersQueryChecksuiteid {
  
  inline def apply(parameters: QueryChecksuiteid, responses: `200ContentApplicationjsonWorkflowruns`): ParametersQueryChecksuiteid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryChecksuiteid]
  }
  
  extension [Self <: ParametersQueryChecksuiteid](x: Self) {
    
    inline def setParameters(value: QueryChecksuiteid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
