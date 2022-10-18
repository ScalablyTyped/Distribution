package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonTotaladvancedsecuritycommitters extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonTotaladvancedsecuritycommitters`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonTotaladvancedsecuritycommitters {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonTotaladvancedsecuritycommitters`): ParametersPathOrgStringResponses200ContentApplicationjsonTotaladvancedsecuritycommitters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonTotaladvancedsecuritycommitters]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200ContentApplicationjsonTotaladvancedsecuritycommitters](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotaladvancedsecuritycommitters`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
