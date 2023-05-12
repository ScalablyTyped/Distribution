package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidResponses7 extends StObject {
  
  var parameters: PathHookid
  
  var responses: `7`
}
object ParametersPathHookidResponses7 {
  
  inline def apply(parameters: PathHookid, responses: `7`): ParametersPathHookidResponses7 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidResponses7] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
