package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseString extends StObject {
  
  var parameters: PathEnterpriseString
  
  var responses: `200ContentApplicationjsonTotalactivecachescount`
}
object ParametersPathEnterpriseString {
  
  inline def apply(parameters: PathEnterpriseString, responses: `200ContentApplicationjsonTotalactivecachescount`): ParametersPathEnterpriseString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseString]
  }
  
  extension [Self <: ParametersPathEnterpriseString](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalactivecachescount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
