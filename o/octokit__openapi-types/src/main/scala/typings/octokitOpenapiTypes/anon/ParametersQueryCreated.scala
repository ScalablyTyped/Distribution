package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCreated extends StObject {
  
  var parameters: QueryCreated
  
  var responses: `200ContentApplicationjsonTotalcountWorkflowruns`
}
object ParametersQueryCreated {
  
  inline def apply(parameters: QueryCreated, responses: `200ContentApplicationjsonTotalcountWorkflowruns`): ParametersQueryCreated = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCreated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryCreated] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryCreated): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
