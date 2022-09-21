package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseStringQueryCountFilter extends StObject {
  
  var parameters: PathEnterpriseStringQueryCountFilter
  
  var responses: `200ContentApplicationjsonResources`
}
object ParametersPathEnterpriseStringQueryCountFilter {
  
  inline def apply(parameters: PathEnterpriseStringQueryCountFilter, responses: `200ContentApplicationjsonResources`): ParametersPathEnterpriseStringQueryCountFilter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseStringQueryCountFilter]
  }
  
  extension [Self <: ParametersPathEnterpriseStringQueryCountFilter](x: Self) {
    
    inline def setParameters(value: PathEnterpriseStringQueryCountFilter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonResources`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
