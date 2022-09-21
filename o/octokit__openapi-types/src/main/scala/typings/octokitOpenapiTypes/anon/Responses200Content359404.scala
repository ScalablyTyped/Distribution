package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content359404 extends StObject {
  
  var parameters: Path361
  
  var responses: `200Content359404`
}
object Responses200Content359404 {
  
  inline def apply(parameters: Path361, responses: `200Content359404`): Responses200Content359404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content359404]
  }
  
  extension [Self <: Responses200Content359404](x: Self) {
    
    inline def setParameters(value: Path361): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content359404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
