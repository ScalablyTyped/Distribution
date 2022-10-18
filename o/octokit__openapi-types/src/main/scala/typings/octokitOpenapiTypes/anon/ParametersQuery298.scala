package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery298 extends StObject {
  
  var parameters: Query298
  
  var responses: `200Content299`
}
object ParametersQuery298 {
  
  inline def apply(parameters: Query298, responses: `200Content299`): ParametersQuery298 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery298]
  }
  
  extension [Self <: ParametersQuery298](x: Self) {
    
    inline def setParameters(value: Query298): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content299`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
