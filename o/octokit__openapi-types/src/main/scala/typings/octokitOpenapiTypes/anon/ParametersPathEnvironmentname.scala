package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentname extends StObject {
  
  var parameters: PathEnvironmentname
  
  var responses: `200ContentApplicationjsonProtectionrules`
}
object ParametersPathEnvironmentname {
  
  inline def apply(parameters: PathEnvironmentname, responses: `200ContentApplicationjsonProtectionrules`): ParametersPathEnvironmentname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentname]
  }
  
  extension [Self <: ParametersPathEnvironmentname](x: Self) {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonProtectionrules`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
