package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content331 extends StObject {
  
  var parameters: `135`
  
  var responses: `200Content331`
}
object Responses200Content331 {
  
  inline def apply(parameters: `135`, responses: `200Content331`): Responses200Content331 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content331]
  }
  
  extension [Self <: Responses200Content331](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content331`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
