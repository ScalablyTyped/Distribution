package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryActor extends StObject {
  
  var parameters: QueryActor
  
  var responses: `200ContentApplicationjsonWorkflowruns`
}
object ParametersQueryActor {
  
  inline def apply(parameters: QueryActor, responses: `200ContentApplicationjsonWorkflowruns`): ParametersQueryActor = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryActor]
  }
  
  extension [Self <: ParametersQueryActor](x: Self) {
    
    inline def setParameters(value: QueryActor): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
