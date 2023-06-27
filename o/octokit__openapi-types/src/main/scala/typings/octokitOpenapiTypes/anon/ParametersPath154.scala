package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath154 extends StObject {
  
  var parameters: Path154
  
  var responses: `200304401403404`
}
object ParametersPath154 {
  
  inline def apply(parameters: Path154, responses: `200304401403404`): ParametersPath154 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath154]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath154] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path154): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
