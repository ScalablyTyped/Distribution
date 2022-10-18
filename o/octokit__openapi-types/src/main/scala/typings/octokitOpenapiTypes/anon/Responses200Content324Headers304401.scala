package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content324Headers304401 extends StObject {
  
  var parameters: `267`
  
  var responses: `200Content324Headers304401`
}
object Responses200Content324Headers304401 {
  
  inline def apply(parameters: `267`, responses: `200Content324Headers304401`): Responses200Content324Headers304401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content324Headers304401]
  }
  
  extension [Self <: Responses200Content324Headers304401](x: Self) {
    
    inline def setParameters(value: `267`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content324Headers304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
