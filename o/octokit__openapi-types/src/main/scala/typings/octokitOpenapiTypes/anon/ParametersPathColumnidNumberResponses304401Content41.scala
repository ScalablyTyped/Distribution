package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathColumnidNumberResponses304401Content41 extends StObject {
  
  var parameters: PathColumnidNumber
  
  var responses: `304401Content41`
}
object ParametersPathColumnidNumberResponses304401Content41 {
  
  inline def apply(parameters: PathColumnidNumber, responses: `304401Content41`): ParametersPathColumnidNumberResponses304401Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathColumnidNumberResponses304401Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathColumnidNumberResponses304401Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
