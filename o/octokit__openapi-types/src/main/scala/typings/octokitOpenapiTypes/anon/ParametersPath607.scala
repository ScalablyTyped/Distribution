package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath607 extends StObject {
  
  var parameters: Path607
  
  var responses: `200Content368`
}
object ParametersPath607 {
  
  inline def apply(parameters: Path607, responses: `200Content368`): ParametersPath607 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath607]
  }
  
  extension [Self <: ParametersPath607](x: Self) {
    
    inline def setParameters(value: Path607): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content368`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
