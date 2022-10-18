package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath246 extends StObject {
  
  var parameters: Path246
  
  var responses: `200Content247`
}
object ParametersPath246 {
  
  inline def apply(parameters: Path246, responses: `200Content247`): ParametersPath246 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath246]
  }
  
  extension [Self <: ParametersPath246](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content247`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
