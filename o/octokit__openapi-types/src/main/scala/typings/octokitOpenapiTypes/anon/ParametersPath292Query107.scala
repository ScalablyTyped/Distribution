package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292Query107 extends StObject {
  
  var parameters: Path292Query107
  
  var responses: `200Content460`
}
object ParametersPath292Query107 {
  
  inline def apply(parameters: Path292Query107, responses: `200Content460`): ParametersPath292Query107 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292Query107]
  }
  
  extension [Self <: ParametersPath292Query107](x: Self) {
    
    inline def setParameters(value: Path292Query107): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content460`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
