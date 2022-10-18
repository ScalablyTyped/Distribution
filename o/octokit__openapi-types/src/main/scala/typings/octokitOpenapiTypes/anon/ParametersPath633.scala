package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath633 extends StObject {
  
  var parameters: Path633
  
  var responses: `200Content632`
}
object ParametersPath633 {
  
  inline def apply(parameters: Path633, responses: `200Content632`): ParametersPath633 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath633]
  }
  
  extension [Self <: ParametersPath633](x: Self) {
    
    inline def setParameters(value: Path633): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content632`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
