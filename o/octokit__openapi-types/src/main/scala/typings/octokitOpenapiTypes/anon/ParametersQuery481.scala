package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery481 extends StObject {
  
  var parameters: Query481
  
  var responses: `200Content482`
}
object ParametersQuery481 {
  
  inline def apply(parameters: Query481, responses: `200Content482`): ParametersQuery481 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery481]
  }
  
  extension [Self <: ParametersQuery481](x: Self) {
    
    inline def setParameters(value: Query481): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
