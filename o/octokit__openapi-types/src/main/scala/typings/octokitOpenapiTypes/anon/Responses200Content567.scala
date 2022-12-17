package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content567 extends StObject {
  
  var parameters: `472`
  
  var responses: `200Content567`
}
object Responses200Content567 {
  
  inline def apply(parameters: `472`, responses: `200Content567`): Responses200Content567 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content567]
  }
  
  extension [Self <: Responses200Content567](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content567`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
