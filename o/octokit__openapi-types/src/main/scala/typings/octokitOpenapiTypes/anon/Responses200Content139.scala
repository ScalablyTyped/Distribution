package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content139 extends StObject {
  
  var parameters: `76`
  
  var responses: `200Content139`
}
object Responses200Content139 {
  
  inline def apply(parameters: `76`, responses: `200Content139`): Responses200Content139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content139]
  }
  
  extension [Self <: Responses200Content139](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content139`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
