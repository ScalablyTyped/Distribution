package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content617 extends StObject {
  
  var parameters: `434`
  
  var responses: `200Content617`
}
object Responses200Content617 {
  
  inline def apply(parameters: `434`, responses: `200Content617`): Responses200Content617 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content617]
  }
  
  extension [Self <: Responses200Content617](x: Self) {
    
    inline def setParameters(value: `434`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content617`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
