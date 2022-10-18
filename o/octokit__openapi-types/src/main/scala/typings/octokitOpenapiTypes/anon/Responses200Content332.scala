package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content332 extends StObject {
  
  var parameters: Path300
  
  var responses: `200Content332`
}
object Responses200Content332 {
  
  inline def apply(parameters: Path300, responses: `200Content332`): Responses200Content332 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content332]
  }
  
  extension [Self <: Responses200Content332](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content332`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
