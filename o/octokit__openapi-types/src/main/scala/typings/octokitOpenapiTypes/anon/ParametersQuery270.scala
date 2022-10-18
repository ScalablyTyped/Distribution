package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery270 extends StObject {
  
  var parameters: Query270
  
  var responses: `200Content271`
}
object ParametersQuery270 {
  
  inline def apply(parameters: Query270, responses: `200Content271`): ParametersQuery270 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery270]
  }
  
  extension [Self <: ParametersQuery270](x: Self) {
    
    inline def setParameters(value: Query270): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content271`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
