package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoWorkflowidQueryCreated extends StObject {
  
  var parameters: PathRepoWorkflowidQueryCreated
  
  var responses: `200ContentApplicationjsonTotalcountWorkflowruns`
}
object ParametersPathRepoWorkflowidQueryCreated {
  
  inline def apply(
    parameters: PathRepoWorkflowidQueryCreated,
    responses: `200ContentApplicationjsonTotalcountWorkflowruns`
  ): ParametersPathRepoWorkflowidQueryCreated = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoWorkflowidQueryCreated]
  }
  
  extension [Self <: ParametersPathRepoWorkflowidQueryCreated](x: Self) {
    
    inline def setParameters(value: PathRepoWorkflowidQueryCreated): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
