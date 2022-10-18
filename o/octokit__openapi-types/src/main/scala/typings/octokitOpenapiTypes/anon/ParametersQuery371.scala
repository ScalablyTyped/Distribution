package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery371 extends StObject {
  
  var parameters: Query371
  
  var responses: `200Content372`
}
object ParametersQuery371 {
  
  inline def apply(parameters: Query371, responses: `200Content372`): ParametersQuery371 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery371]
  }
  
  extension [Self <: ParametersQuery371](x: Self) {
    
    inline def setParameters(value: Query371): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content372`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
