package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidNumberResponses401Content41403Content41404Content41 extends StObject {
  
  var parameters: PathKeyidNumber
  
  var responses: `401Content41403Content41404Content41`
}
object ParametersPathKeyidNumberResponses401Content41403Content41404Content41 {
  
  inline def apply(parameters: PathKeyidNumber, responses: `401Content41403Content41404Content41`): ParametersPathKeyidNumberResponses401Content41403Content41404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidNumberResponses401Content41403Content41404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathKeyidNumberResponses401Content41403Content41404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathKeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403Content41404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
