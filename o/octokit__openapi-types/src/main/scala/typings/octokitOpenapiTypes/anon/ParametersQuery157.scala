package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery157 extends StObject {
  
  var parameters: Query157
  
  var responses: `200Content158`
}
object ParametersQuery157 {
  
  inline def apply(parameters: Query157, responses: `200Content158`): ParametersQuery157 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery157]
  }
  
  extension [Self <: ParametersQuery157](x: Self) {
    
    inline def setParameters(value: Query157): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content158`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
