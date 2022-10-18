package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content191 extends StObject {
  
  var parameters: `76`
  
  var responses: `200Content191`
}
object Responses200Content191 {
  
  inline def apply(parameters: `76`, responses: `200Content191`): Responses200Content191 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content191]
  }
  
  extension [Self <: Responses200Content191](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content191`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
