package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRequiredworkflowidforrepo extends StObject {
  
  var parameters: PathOwnerRepoRequiredworkflowidforrepo
  
  var responses: `200ContentApplicationjsonTotalcountWorkflowruns`
}
object ParametersPathOwnerRepoRequiredworkflowidforrepo {
  
  inline def apply(
    parameters: PathOwnerRepoRequiredworkflowidforrepo,
    responses: `200ContentApplicationjsonTotalcountWorkflowruns`
  ): ParametersPathOwnerRepoRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoRequiredworkflowidforrepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
