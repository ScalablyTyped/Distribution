package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathWorkflowidQuery extends StObject {
  
  var parameters: PathWorkflowidQuery
  
  var responses: `200ContentApplicationjsonWorkflowruns`
}
object ParametersPathWorkflowidQuery {
  
  inline def apply(parameters: PathWorkflowidQuery, responses: `200ContentApplicationjsonWorkflowruns`): ParametersPathWorkflowidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathWorkflowidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathWorkflowidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathWorkflowidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
