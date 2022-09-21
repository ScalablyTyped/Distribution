package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery498 extends StObject {
  
  var parameters: Query498
  
  var responses: `499`
}
object ParametersQuery498 {
  
  inline def apply(parameters: Query498, responses: `499`): ParametersQuery498 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery498]
  }
  
  extension [Self <: ParametersQuery498](x: Self) {
    
    inline def setParameters(value: Query498): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `499`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
