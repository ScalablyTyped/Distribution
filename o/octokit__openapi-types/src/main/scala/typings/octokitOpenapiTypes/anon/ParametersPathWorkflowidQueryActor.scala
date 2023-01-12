package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathWorkflowidQueryActor extends StObject {
  
  var parameters: PathWorkflowidQueryActor
  
  var responses: `200ContentApplicationjsonWorkflowruns`
}
object ParametersPathWorkflowidQueryActor {
  
  inline def apply(parameters: PathWorkflowidQueryActor, responses: `200ContentApplicationjsonWorkflowruns`): ParametersPathWorkflowidQueryActor = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathWorkflowidQueryActor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathWorkflowidQueryActor] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathWorkflowidQueryActor): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonWorkflowruns`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
