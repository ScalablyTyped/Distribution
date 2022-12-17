package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content236 extends StObject {
  
  var parameters: `234`
  
  var responses: `200Content236`
}
object Responses200Content236 {
  
  inline def apply(parameters: `234`, responses: `200Content236`): Responses200Content236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content236]
  }
  
  extension [Self <: Responses200Content236](x: Self) {
    
    inline def setParameters(value: `234`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
