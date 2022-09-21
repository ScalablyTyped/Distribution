package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content318 extends StObject {
  
  var parameters: Query197
  
  var responses: `200Content318`
}
object Responses200Content318 {
  
  inline def apply(parameters: Query197, responses: `200Content318`): Responses200Content318 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content318]
  }
  
  extension [Self <: Responses200Content318](x: Self) {
    
    inline def setParameters(value: Query197): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content318`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
