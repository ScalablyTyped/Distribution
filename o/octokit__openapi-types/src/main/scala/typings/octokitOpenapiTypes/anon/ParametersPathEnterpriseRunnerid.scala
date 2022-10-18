package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnerid extends StObject {
  
  var parameters: PathEnterpriseRunnerid
  
  var responses: `200ContentApplicationjsonOs`
}
object ParametersPathEnterpriseRunnerid {
  
  inline def apply(parameters: PathEnterpriseRunnerid, responses: `200ContentApplicationjsonOs`): ParametersPathEnterpriseRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnerid]
  }
  
  extension [Self <: ParametersPathEnterpriseRunnerid](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOs`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
