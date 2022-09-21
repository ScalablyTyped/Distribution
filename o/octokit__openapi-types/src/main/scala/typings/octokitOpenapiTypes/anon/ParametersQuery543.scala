package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery543 extends StObject {
  
  var parameters: Query543
  
  var responses: `200Content544`
}
object ParametersQuery543 {
  
  inline def apply(parameters: Query543, responses: `200Content544`): ParametersQuery543 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery543]
  }
  
  extension [Self <: ParametersQuery543](x: Self) {
    
    inline def setParameters(value: Query543): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content544`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
