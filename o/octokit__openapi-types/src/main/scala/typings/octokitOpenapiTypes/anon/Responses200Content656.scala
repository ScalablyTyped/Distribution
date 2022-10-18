package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content656 extends StObject {
  
  var parameters: Path615Query250
  
  var responses: `200Content656`
}
object Responses200Content656 {
  
  inline def apply(parameters: Path615Query250, responses: `200Content656`): Responses200Content656 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content656]
  }
  
  extension [Self <: Responses200Content656](x: Self) {
    
    inline def setParameters(value: Path615Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content656`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
