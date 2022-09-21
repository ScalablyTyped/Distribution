package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters606 extends StObject {
  
  var parameters: `606`
  
  var responses: `200Content442304Unknown`
}
object Parameters606 {
  
  inline def apply(parameters: `606`, responses: `200Content442304Unknown`): Parameters606 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters606]
  }
  
  extension [Self <: Parameters606](x: Self) {
    
    inline def setParameters(value: `606`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content442304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
