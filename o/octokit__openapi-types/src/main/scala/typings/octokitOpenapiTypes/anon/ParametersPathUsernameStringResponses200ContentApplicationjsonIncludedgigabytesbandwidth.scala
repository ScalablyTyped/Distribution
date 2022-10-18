package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `200ContentApplicationjsonIncludedgigabytesbandwidth`
}
object ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth {
  
  inline def apply(parameters: PathUsernameString, responses: `200ContentApplicationjsonIncludedgigabytesbandwidth`): ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth]
  }
  
  extension [Self <: ParametersPathUsernameStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedgigabytesbandwidth`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
