package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonIncludedgigabytesbandwidth`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonIncludedgigabytesbandwidth`): ParametersPathOrgStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200ContentApplicationjsonIncludedgigabytesbandwidth](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludedgigabytesbandwidth`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
