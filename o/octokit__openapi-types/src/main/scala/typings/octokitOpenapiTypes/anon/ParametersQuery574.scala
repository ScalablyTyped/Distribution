package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery574 extends StObject {
  
  var parameters: Query574
  
  var responses: `200Content482404Content55`
}
object ParametersQuery574 {
  
  inline def apply(parameters: Query574, responses: `200Content482404Content55`): ParametersQuery574 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery574]
  }
  
  extension [Self <: ParametersQuery574](x: Self) {
    
    inline def setParameters(value: Query574): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
