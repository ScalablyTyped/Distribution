package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615Query270 extends StObject {
  
  var parameters: Path615Query270
  
  var responses: `200Content271422`
}
object ParametersPath615Query270 {
  
  inline def apply(parameters: Path615Query270, responses: `200Content271422`): ParametersPath615Query270 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615Query270]
  }
  
  extension [Self <: ParametersPath615Query270](x: Self) {
    
    inline def setParameters(value: Path615Query270): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content271422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
