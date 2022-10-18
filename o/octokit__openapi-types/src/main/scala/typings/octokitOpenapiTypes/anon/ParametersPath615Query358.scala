package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615Query358 extends StObject {
  
  var parameters: Path615Query358
  
  var responses: `200Content359422`
}
object ParametersPath615Query358 {
  
  inline def apply(parameters: Path615Query358, responses: `200Content359422`): ParametersPath615Query358 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615Query358]
  }
  
  extension [Self <: ParametersPath615Query358](x: Self) {
    
    inline def setParameters(value: Path615Query358): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content359422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
