package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGpgkeyidResponses158 extends StObject {
  
  var parameters: PathGpgkeyid
  
  var responses: `158`
}
object ParametersPathGpgkeyidResponses158 {
  
  inline def apply(parameters: PathGpgkeyid, responses: `158`): ParametersPathGpgkeyidResponses158 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGpgkeyidResponses158]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGpgkeyidResponses158] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGpgkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `158`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
