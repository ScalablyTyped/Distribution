package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content372 extends StObject {
  
  var parameters: `34`
  
  var responses: `200Content372`
}
object Responses200Content372 {
  
  inline def apply(parameters: `34`, responses: `200Content372`): Responses200Content372 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content372]
  }
  
  extension [Self <: Responses200Content372](x: Self) {
    
    inline def setParameters(value: `34`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content372`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
