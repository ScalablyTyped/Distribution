package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content159 extends StObject {
  
  var parameters: `76`
  
  var responses: `200Content159`
}
object Responses200Content159 {
  
  inline def apply(parameters: `76`, responses: `200Content159`): Responses200Content159 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content159]
  }
  
  extension [Self <: Responses200Content159](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content159`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
