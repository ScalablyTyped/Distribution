package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecurityproduct extends StObject {
  
  var parameters: PathSecurityproduct
  
  var responses: `422Unknown`
}
object ParametersPathSecurityproduct {
  
  inline def apply(parameters: PathSecurityproduct, responses: `422Unknown`): ParametersPathSecurityproduct = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecurityproduct]
  }
  
  extension [Self <: ParametersPathSecurityproduct](x: Self) {
    
    inline def setParameters(value: PathSecurityproduct): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
