package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerResponses200ContentApplicationjsonSecret extends StObject {
  
  var parameters: PathHookidOwner
  
  var responses: `200ContentApplicationjsonSecret`
}
object ParametersPathHookidOwnerResponses200ContentApplicationjsonSecret {
  
  inline def apply(parameters: PathHookidOwner, responses: `200ContentApplicationjsonSecret`): ParametersPathHookidOwnerResponses200ContentApplicationjsonSecret = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerResponses200ContentApplicationjsonSecret]
  }
  
  extension [Self <: ParametersPathHookidOwnerResponses200ContentApplicationjsonSecret](x: Self) {
    
    inline def setParameters(value: PathHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecret`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
