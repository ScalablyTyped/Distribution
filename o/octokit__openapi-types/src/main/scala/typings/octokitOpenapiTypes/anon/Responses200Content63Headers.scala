package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content63Headers extends StObject {
  
  var parameters: `34`
  
  var responses: `200Content63Headers`
}
object Responses200Content63Headers {
  
  inline def apply(parameters: `34`, responses: `200Content63Headers`): Responses200Content63Headers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content63Headers]
  }
  
  extension [Self <: Responses200Content63Headers](x: Self) {
    
    inline def setParameters(value: `34`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content63Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
