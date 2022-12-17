package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content596 extends StObject {
  
  var parameters: Path577Query407
  
  var responses: `200Content596`
}
object Responses200Content596 {
  
  inline def apply(parameters: Path577Query407, responses: `200Content596`): Responses200Content596 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content596]
  }
  
  extension [Self <: Responses200Content596](x: Self) {
    
    inline def setParameters(value: Path577Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content596`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
