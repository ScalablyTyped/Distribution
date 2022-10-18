package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedminutes extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `200ContentApplicationjsonIncludedminutes`
}
object ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedminutes {
  
  inline def apply(parameters: PathUsernameString, responses: `200ContentApplicationjsonIncludedminutes`): ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedminutes]
  }
  
  extension [Self <: ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedminutes](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedminutes`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
