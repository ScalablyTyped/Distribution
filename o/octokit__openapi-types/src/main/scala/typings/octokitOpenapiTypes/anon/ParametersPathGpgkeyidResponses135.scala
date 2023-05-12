package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGpgkeyidResponses135 extends StObject {
  
  var parameters: PathGpgkeyid
  
  var responses: `135`
}
object ParametersPathGpgkeyidResponses135 {
  
  inline def apply(parameters: PathGpgkeyid, responses: `135`): ParametersPathGpgkeyidResponses135 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGpgkeyidResponses135]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGpgkeyidResponses135] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGpgkeyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `135`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
