package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions extends StObject {
  
  var parameters: PathEnterpriseString
  
  var responses: `200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions`
}
object Responses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions {
  
  inline def apply(
    parameters: PathEnterpriseString,
    responses: `200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions`
  ): Responses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions]
  }
  
  extension [Self <: Responses200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCanapprovepullrequestreviewsDefaultworkflowpermissions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
