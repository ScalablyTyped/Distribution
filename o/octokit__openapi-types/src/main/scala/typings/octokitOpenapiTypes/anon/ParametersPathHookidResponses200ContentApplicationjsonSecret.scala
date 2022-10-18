package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidResponses200ContentApplicationjsonSecret extends StObject {
  
  var parameters: PathHookid
  
  var responses: `200ContentApplicationjsonSecret`
}
object ParametersPathHookidResponses200ContentApplicationjsonSecret {
  
  inline def apply(parameters: PathHookid, responses: `200ContentApplicationjsonSecret`): ParametersPathHookidResponses200ContentApplicationjsonSecret = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidResponses200ContentApplicationjsonSecret]
  }
  
  extension [Self <: ParametersPathHookidResponses200ContentApplicationjsonSecret](x: Self) {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecret`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
