package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoWorkflowidQueryActorBranch extends StObject {
  
  var parameters: PathRepoWorkflowidQueryActorBranch
  
  var responses: `200ContentApplicationjsonTotalcountWorkflowruns`
}
object ParametersPathRepoWorkflowidQueryActorBranch {
  
  inline def apply(
    parameters: PathRepoWorkflowidQueryActorBranch,
    responses: `200ContentApplicationjsonTotalcountWorkflowruns`
  ): ParametersPathRepoWorkflowidQueryActorBranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoWorkflowidQueryActorBranch]
  }
  
  extension [Self <: ParametersPathRepoWorkflowidQueryActorBranch](x: Self) {
    
    inline def setParameters(value: PathRepoWorkflowidQueryActorBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
