package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGpgkeyidNumberResponses304401Content41403Content41 extends StObject {
  
  var parameters: PathGpgkeyidNumber
  
  var responses: `304401Content41403Content41`
}
object ParametersPathGpgkeyidNumberResponses304401Content41403Content41 {
  
  inline def apply(parameters: PathGpgkeyidNumber, responses: `304401Content41403Content41`): ParametersPathGpgkeyidNumberResponses304401Content41403Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGpgkeyidNumberResponses304401Content41403Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGpgkeyidNumberResponses304401Content41403Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGpgkeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401Content41403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
