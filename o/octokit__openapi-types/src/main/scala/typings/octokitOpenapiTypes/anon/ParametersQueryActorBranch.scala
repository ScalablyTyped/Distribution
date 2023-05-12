package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryActorBranch extends StObject {
  
  var parameters: QueryActorBranch
  
  var responses: `200ContentApplicationjsonTotalcountWorkflowruns`
}
object ParametersQueryActorBranch {
  
  inline def apply(parameters: QueryActorBranch, responses: `200ContentApplicationjsonTotalcountWorkflowruns`): ParametersQueryActorBranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryActorBranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryActorBranch] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryActorBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
