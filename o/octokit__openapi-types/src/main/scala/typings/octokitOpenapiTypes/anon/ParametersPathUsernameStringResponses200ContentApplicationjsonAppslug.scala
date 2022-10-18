package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringResponses200ContentApplicationjsonAppslug extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `200ContentApplicationjsonAppslug`
}
object ParametersPathUsernameStringResponses200ContentApplicationjsonAppslug {
  
  inline def apply(parameters: PathUsernameString, responses: `200ContentApplicationjsonAppslug`): ParametersPathUsernameStringResponses200ContentApplicationjsonAppslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringResponses200ContentApplicationjsonAppslug]
  }
  
  extension [Self <: ParametersPathUsernameStringResponses200ContentApplicationjsonAppslug](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAppslug`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
