package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery167 extends StObject {
  
  var parameters: Query167
  
  var responses: `200Content168`
}
object ParametersQuery167 {
  
  inline def apply(parameters: Query167, responses: `200Content168`): ParametersQuery167 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery167]
  }
  
  extension [Self <: ParametersQuery167](x: Self) {
    
    inline def setParameters(value: Query167): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content168`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
