package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content105 extends StObject {
  
  var parameters: `76`
  
  var responses: `200Content105`
}
object Responses200Content105 {
  
  inline def apply(parameters: `76`, responses: `200Content105`): Responses200Content105 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content105]
  }
  
  extension [Self <: Responses200Content105](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content105`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
