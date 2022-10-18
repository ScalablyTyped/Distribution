package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery136 extends StObject {
  
  var parameters: Query136
  
  var responses: `200Content137`
}
object ParametersQuery136 {
  
  inline def apply(parameters: Query136, responses: `200Content137`): ParametersQuery136 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery136]
  }
  
  extension [Self <: ParametersQuery136](x: Self) {
    
    inline def setParameters(value: Query136): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content137`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
