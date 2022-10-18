package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content624Headers extends StObject {
  
  var parameters: `267`
  
  var responses: `200Content624Headers`
}
object Responses200Content624Headers {
  
  inline def apply(parameters: `267`, responses: `200Content624Headers`): Responses200Content624Headers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content624Headers]
  }
  
  extension [Self <: Responses200Content624Headers](x: Self) {
    
    inline def setParameters(value: `267`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content624Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
