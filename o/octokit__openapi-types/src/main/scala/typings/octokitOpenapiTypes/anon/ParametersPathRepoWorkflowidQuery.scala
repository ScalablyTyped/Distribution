package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoWorkflowidQuery extends StObject {
  
  var parameters: PathRepoWorkflowidQuery
  
  var responses: `200ContentApplicationjsonTotalcountWorkflowruns`
}
object ParametersPathRepoWorkflowidQuery {
  
  inline def apply(parameters: PathRepoWorkflowidQuery, responses: `200ContentApplicationjsonTotalcountWorkflowruns`): ParametersPathRepoWorkflowidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoWorkflowidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoWorkflowidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoWorkflowidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
