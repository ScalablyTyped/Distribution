package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath637 extends StObject {
  
  var parameters: Path637
  
  var responses: `200Content347304`
}
object ParametersPath637 {
  
  inline def apply(parameters: Path637, responses: `200Content347304`): ParametersPath637 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath637]
  }
  
  extension [Self <: ParametersPath637](x: Self) {
    
    inline def setParameters(value: Path637): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content347304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
