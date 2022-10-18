package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615Query650 extends StObject {
  
  var parameters: Path615Query650
  
  var responses: `200Content659`
}
object ParametersPath615Query650 {
  
  inline def apply(parameters: Path615Query650, responses: `200Content659`): ParametersPath615Query650 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615Query650]
  }
  
  extension [Self <: ParametersPath615Query650](x: Self) {
    
    inline def setParameters(value: Path615Query650): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content659`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
