package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery555 extends StObject {
  
  var parameters: Query555
  
  var responses: `200Content465404Content48`
}
object ParametersQuery555 {
  
  inline def apply(parameters: Query555, responses: `200Content465404Content48`): ParametersQuery555 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery555]
  }
  
  extension [Self <: ParametersQuery555](x: Self) {
    
    inline def setParameters(value: Query555): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content465404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
