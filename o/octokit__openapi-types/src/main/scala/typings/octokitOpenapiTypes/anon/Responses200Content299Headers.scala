package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content299Headers extends StObject {
  
  var parameters: `267`
  
  var responses: `200Content299Headers`
}
object Responses200Content299Headers {
  
  inline def apply(parameters: `267`, responses: `200Content299Headers`): Responses200Content299Headers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content299Headers]
  }
  
  extension [Self <: Responses200Content299Headers](x: Self) {
    
    inline def setParameters(value: `267`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content299Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
