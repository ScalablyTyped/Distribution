package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath154Responses50 extends StObject {
  
  var parameters: Path154
  
  var responses: `50`
}
object ParametersPath154Responses50 {
  
  inline def apply(parameters: Path154, responses: `50`): ParametersPath154Responses50 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath154Responses50]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath154Responses50] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path154): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `50`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
