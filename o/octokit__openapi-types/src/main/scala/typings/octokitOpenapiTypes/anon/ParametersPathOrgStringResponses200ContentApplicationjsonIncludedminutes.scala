package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonIncludedminutes extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonIncludedminutes`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonIncludedminutes {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonIncludedminutes`): ParametersPathOrgStringResponses200ContentApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonIncludedminutes]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200ContentApplicationjsonIncludedminutes](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedminutes`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
