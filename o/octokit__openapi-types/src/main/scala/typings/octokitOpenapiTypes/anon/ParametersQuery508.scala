package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery508 extends StObject {
  
  var parameters: Query508
  
  var responses: `200Content509`
}
object ParametersQuery508 {
  
  inline def apply(parameters: Query508, responses: `200Content509`): ParametersQuery508 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery508]
  }
  
  extension [Self <: ParametersQuery508](x: Self) {
    
    inline def setParameters(value: Query508): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content509`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
