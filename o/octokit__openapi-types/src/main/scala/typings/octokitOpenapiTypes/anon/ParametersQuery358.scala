package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery358 extends StObject {
  
  var parameters: Query358
  
  var responses: `200Content359`
}
object ParametersQuery358 {
  
  inline def apply(parameters: Query358, responses: `200Content359`): ParametersQuery358 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery358]
  }
  
  extension [Self <: ParametersQuery358](x: Self) {
    
    inline def setParameters(value: Query358): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content359`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
