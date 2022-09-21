package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath139 extends StObject {
  
  var parameters: Path139
  
  var responses: `200Content108`
}
object ParametersPath139 {
  
  inline def apply(parameters: Path139, responses: `200Content108`): ParametersPath139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath139]
  }
  
  extension [Self <: ParametersPath139](x: Self) {
    
    inline def setParameters(value: Path139): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content108`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
