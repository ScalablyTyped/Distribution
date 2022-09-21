package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content389 extends StObject {
  
  var parameters: `34`
  
  var responses: `200Content389`
}
object Responses200Content389 {
  
  inline def apply(parameters: `34`, responses: `200Content389`): Responses200Content389 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content389]
  }
  
  extension [Self <: Responses200Content389](x: Self) {
    
    inline def setParameters(value: `34`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content389`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
