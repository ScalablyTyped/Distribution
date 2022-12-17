package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGpgkeyidResponses131 extends StObject {
  
  var parameters: PathGpgkeyid
  
  var responses: `131`
}
object ParametersPathGpgkeyidResponses131 {
  
  inline def apply(parameters: PathGpgkeyid, responses: `131`): ParametersPathGpgkeyidResponses131 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGpgkeyidResponses131]
  }
  
  extension [Self <: ParametersPathGpgkeyidResponses131](x: Self) {
    
    inline def setParameters(value: PathGpgkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `131`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
