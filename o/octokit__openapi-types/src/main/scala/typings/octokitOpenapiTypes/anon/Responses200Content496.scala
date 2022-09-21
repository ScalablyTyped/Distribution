package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content496 extends StObject {
  
  var parameters: `495`
  
  var responses: `200Content496`
}
object Responses200Content496 {
  
  inline def apply(parameters: `495`, responses: `200Content496`): Responses200Content496 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content496]
  }
  
  extension [Self <: Responses200Content496](x: Self) {
    
    inline def setParameters(value: `495`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content496`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
