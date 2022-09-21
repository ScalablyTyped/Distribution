package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content161 extends StObject {
  
  var parameters: `157`
  
  var responses: `200Content161`
}
object Responses200Content161 {
  
  inline def apply(parameters: `157`, responses: `200Content161`): Responses200Content161 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content161]
  }
  
  extension [Self <: Responses200Content161](x: Self) {
    
    inline def setParameters(value: `157`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content161`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
