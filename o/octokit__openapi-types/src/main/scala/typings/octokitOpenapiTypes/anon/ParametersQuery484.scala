package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery484 extends StObject {
  
  var parameters: Query484
  
  var responses: `200Content485`
}
object ParametersQuery484 {
  
  inline def apply(parameters: Query484, responses: `200Content485`): ParametersQuery484 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery484]
  }
  
  extension [Self <: ParametersQuery484](x: Self) {
    
    inline def setParameters(value: Query484): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content485`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
