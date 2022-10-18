package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath386 extends StObject {
  
  var parameters: Path386
  
  var responses: `200Content387`
}
object ParametersPath386 {
  
  inline def apply(parameters: Path386, responses: `200Content387`): ParametersPath386 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath386]
  }
  
  extension [Self <: ParametersPath386](x: Self) {
    
    inline def setParameters(value: Path386): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content387`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
