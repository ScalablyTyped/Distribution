package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery519 extends StObject {
  
  var parameters: Query519
  
  var responses: `200Content520`
}
object ParametersQuery519 {
  
  inline def apply(parameters: Query519, responses: `200Content520`): ParametersQuery519 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery519]
  }
  
  extension [Self <: ParametersQuery519](x: Self) {
    
    inline def setParameters(value: Query519): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content520`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
