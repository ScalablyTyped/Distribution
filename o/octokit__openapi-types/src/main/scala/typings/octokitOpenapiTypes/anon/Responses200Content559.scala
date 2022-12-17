package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content559 extends StObject {
  
  var parameters: `472`
  
  var responses: `200Content559`
}
object Responses200Content559 {
  
  inline def apply(parameters: `472`, responses: `200Content559`): Responses200Content559 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content559]
  }
  
  extension [Self <: Responses200Content559](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content559`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
