package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseororgString extends StObject {
  
  var parameters: PathEnterpriseororgString
  
  var responses: `200Content425`
}
object ParametersPathEnterpriseororgString {
  
  inline def apply(parameters: PathEnterpriseororgString, responses: `200Content425`): ParametersPathEnterpriseororgString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseororgString]
  }
  
  extension [Self <: ParametersPathEnterpriseororgString](x: Self) {
    
    inline def setParameters(value: PathEnterpriseororgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content425`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
