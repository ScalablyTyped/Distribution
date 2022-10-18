package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath241 extends StObject {
  
  var parameters: Path241
  
  var responses: `200Content227403`
}
object ParametersPath241 {
  
  inline def apply(parameters: Path241, responses: `200Content227403`): ParametersPath241 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath241]
  }
  
  extension [Self <: ParametersPath241](x: Self) {
    
    inline def setParameters(value: Path241): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content227403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
