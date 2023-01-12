package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssignee extends StObject {
  
  var parameters: PathAssignee
  
  var responses: `404Content48`
}
object ParametersPathAssignee {
  
  inline def apply(parameters: PathAssignee, responses: `404Content48`): ParametersPathAssignee = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssignee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAssignee] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssignee): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
