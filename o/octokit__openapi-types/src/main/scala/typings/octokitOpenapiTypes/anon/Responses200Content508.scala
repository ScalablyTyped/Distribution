package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content508 extends StObject {
  
  var parameters: `506`
  
  var responses: `200Content508`
}
object Responses200Content508 {
  
  inline def apply(parameters: `506`, responses: `200Content508`): Responses200Content508 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content508]
  }
  
  extension [Self <: Responses200Content508](x: Self) {
    
    inline def setParameters(value: `506`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content508`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
