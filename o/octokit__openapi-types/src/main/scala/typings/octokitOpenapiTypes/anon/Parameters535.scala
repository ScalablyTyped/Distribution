package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters535 extends StObject {
  
  var parameters: `535`
  
  var responses: `200Content536`
}
object Parameters535 {
  
  inline def apply(parameters: `535`, responses: `200Content536`): Parameters535 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters535]
  }
  
  extension [Self <: Parameters535](x: Self) {
    
    inline def setParameters(value: `535`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content536`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
