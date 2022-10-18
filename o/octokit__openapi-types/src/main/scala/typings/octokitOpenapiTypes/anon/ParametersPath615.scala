package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615 extends StObject {
  
  var parameters: Path615
  
  var responses: `403404Content6`
}
object ParametersPath615 {
  
  inline def apply(parameters: Path615, responses: `403404Content6`): ParametersPath615 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615]
  }
  
  extension [Self <: ParametersPath615](x: Self) {
    
    inline def setParameters(value: Path615): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
