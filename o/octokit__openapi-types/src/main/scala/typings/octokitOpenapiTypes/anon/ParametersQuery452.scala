package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery452 extends StObject {
  
  var parameters: Query452
  
  var responses: `453`
}
object ParametersQuery452 {
  
  inline def apply(parameters: Query452, responses: `453`): ParametersQuery452 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery452]
  }
  
  extension [Self <: ParametersQuery452](x: Self) {
    
    inline def setParameters(value: Query452): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `453`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
