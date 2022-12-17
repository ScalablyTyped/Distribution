package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content184 extends StObject {
  
  var parameters: `135`
  
  var responses: `200Content184`
}
object Responses200Content184 {
  
  inline def apply(parameters: `135`, responses: `200Content184`): Responses200Content184 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content184]
  }
  
  extension [Self <: Responses200Content184](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content184`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
