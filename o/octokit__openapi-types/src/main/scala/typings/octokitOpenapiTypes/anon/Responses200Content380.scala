package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content380 extends StObject {
  
  var parameters: Path364Query250
  
  var responses: `200Content380`
}
object Responses200Content380 {
  
  inline def apply(parameters: Path364Query250, responses: `200Content380`): Responses200Content380 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content380]
  }
  
  extension [Self <: Responses200Content380](x: Self) {
    
    inline def setParameters(value: Path364Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content380`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
