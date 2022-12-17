package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content539 extends StObject {
  
  var parameters: `472`
  
  var responses: `200Content539`
}
object Responses200Content539 {
  
  inline def apply(parameters: `472`, responses: `200Content539`): Responses200Content539 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content539]
  }
  
  extension [Self <: Responses200Content539](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content539`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
