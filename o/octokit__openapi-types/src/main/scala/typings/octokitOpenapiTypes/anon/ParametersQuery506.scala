package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery506 extends StObject {
  
  var parameters: Query506
  
  var responses: `200Content507`
}
object ParametersQuery506 {
  
  inline def apply(parameters: Query506, responses: `200Content507`): ParametersQuery506 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery506]
  }
  
  extension [Self <: ParametersQuery506](x: Self) {
    
    inline def setParameters(value: Query506): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content507`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
