package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery577 extends StObject {
  
  var parameters: Query577
  
  var responses: `200Content375404`
}
object ParametersQuery577 {
  
  inline def apply(parameters: Query577, responses: `200Content375404`): ParametersQuery577 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery577]
  }
  
  extension [Self <: ParametersQuery577](x: Self) {
    
    inline def setParameters(value: Query577): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content375404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
