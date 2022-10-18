package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters506 extends StObject {
  
  var parameters: `506`
  
  var responses: `200Content507`
}
object Parameters506 {
  
  inline def apply(parameters: `506`, responses: `200Content507`): Parameters506 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters506]
  }
  
  extension [Self <: Parameters506](x: Self) {
    
    inline def setParameters(value: `506`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content507`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
