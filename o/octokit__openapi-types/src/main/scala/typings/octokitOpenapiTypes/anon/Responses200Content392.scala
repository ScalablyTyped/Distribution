package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content392 extends StObject {
  
  var parameters: Path390
  
  var responses: `200Content392`
}
object Responses200Content392 {
  
  inline def apply(parameters: Path390, responses: `200Content392`): Responses200Content392 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content392]
  }
  
  extension [Self <: Responses200Content392](x: Self) {
    
    inline def setParameters(value: Path390): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content392`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
