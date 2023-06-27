package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyidNumberResponses401Content41403Content41404Content41 extends StObject {
  
  var parameters: PathSshsigningkeyidNumber
  
  var responses: `401Content41403Content41404Content41`
}
object ParametersPathSshsigningkeyidNumberResponses401Content41403Content41404Content41 {
  
  inline def apply(parameters: PathSshsigningkeyidNumber, responses: `401Content41403Content41404Content41`): ParametersPathSshsigningkeyidNumberResponses401Content41403Content41404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyidNumberResponses401Content41403Content41404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSshsigningkeyidNumberResponses401Content41403Content41404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSshsigningkeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403Content41404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
