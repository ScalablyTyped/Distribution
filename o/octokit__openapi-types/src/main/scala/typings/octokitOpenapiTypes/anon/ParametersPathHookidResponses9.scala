package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidResponses9 extends StObject {
  
  var parameters: PathHookid
  
  var responses: `9`
}
object ParametersPathHookidResponses9 {
  
  inline def apply(parameters: PathHookid, responses: `9`): ParametersPathHookidResponses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidResponses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
