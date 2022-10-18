package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content419 extends StObject {
  
  var parameters: `418`
  
  var responses: `200Content419`
}
object Responses200Content419 {
  
  inline def apply(parameters: `418`, responses: `200Content419`): Responses200Content419 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content419]
  }
  
  extension [Self <: Responses200Content419](x: Self) {
    
    inline def setParameters(value: `418`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content419`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
