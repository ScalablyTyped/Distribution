package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery635 extends StObject {
  
  var parameters: Query635
  
  var responses: `200Content636`
}
object ParametersQuery635 {
  
  inline def apply(parameters: Query635, responses: `200Content636`): ParametersQuery635 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery635]
  }
  
  extension [Self <: ParametersQuery635](x: Self) {
    
    inline def setParameters(value: Query635): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content636`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
