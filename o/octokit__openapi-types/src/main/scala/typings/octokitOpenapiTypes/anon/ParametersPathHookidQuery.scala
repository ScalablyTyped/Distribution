package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidQuery extends StObject {
  
  var parameters: PathHookidQuery
  
  var responses: `400`
}
object ParametersPathHookidQuery {
  
  inline def apply(parameters: PathHookidQuery, responses: `400`): ParametersPathHookidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
