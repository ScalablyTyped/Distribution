package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery455 extends StObject {
  
  var parameters: Query455
  
  var responses: `200Content456`
}
object ParametersQuery455 {
  
  inline def apply(parameters: Query455, responses: `200Content456`): ParametersQuery455 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery455]
  }
  
  extension [Self <: ParametersQuery455](x: Self) {
    
    inline def setParameters(value: Query455): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content456`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
