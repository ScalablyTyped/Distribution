package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath643 extends StObject {
  
  var parameters: Path643
  
  var responses: `200Content357`
}
object ParametersPath643 {
  
  inline def apply(parameters: Path643, responses: `200Content357`): ParametersPath643 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath643]
  }
  
  extension [Self <: ParametersPath643](x: Self) {
    
    inline def setParameters(value: Path643): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content357`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
