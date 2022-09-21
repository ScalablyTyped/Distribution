package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidResponses6 extends StObject {
  
  var parameters: PathHookid
  
  var responses: `6`
}
object ParametersPathHookidResponses6 {
  
  inline def apply(parameters: PathHookid, responses: `6`): ParametersPathHookidResponses6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidResponses6]
  }
  
  extension [Self <: ParametersPathHookidResponses6](x: Self) {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
