package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery586 extends StObject {
  
  var parameters: Query586
  
  var responses: `200Content587`
}
object ParametersQuery586 {
  
  inline def apply(parameters: Query586, responses: `200Content587`): ParametersQuery586 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery586]
  }
  
  extension [Self <: ParametersQuery586](x: Self) {
    
    inline def setParameters(value: Query586): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content587`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
