package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions {
  
  inline def apply(
    parameters: PathOrgString,
    responses: `200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions`
  ): ParametersPathOrgStringResponses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
