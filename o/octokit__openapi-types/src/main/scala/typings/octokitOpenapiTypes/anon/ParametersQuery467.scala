package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery467 extends StObject {
  
  var parameters: Query467
  
  var responses: `453`
}
object ParametersQuery467 {
  
  inline def apply(parameters: Query467, responses: `453`): ParametersQuery467 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery467]
  }
  
  extension [Self <: ParametersQuery467](x: Self) {
    
    inline def setParameters(value: Query467): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `453`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
