package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery223 extends StObject {
  
  var parameters: Query223
  
  var responses: `200Content224`
}
object ParametersQuery223 {
  
  inline def apply(parameters: Query223, responses: `200Content224`): ParametersQuery223 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery223]
  }
  
  extension [Self <: ParametersQuery223](x: Self) {
    
    inline def setParameters(value: Query223): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content224`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
