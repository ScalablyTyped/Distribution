package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGpgkeyidResponses140 extends StObject {
  
  var parameters: PathGpgkeyid
  
  var responses: `140`
}
object ParametersPathGpgkeyidResponses140 {
  
  inline def apply(parameters: PathGpgkeyid, responses: `140`): ParametersPathGpgkeyidResponses140 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGpgkeyidResponses140]
  }
  
  extension [Self <: ParametersPathGpgkeyidResponses140](x: Self) {
    
    inline def setParameters(value: PathGpgkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
