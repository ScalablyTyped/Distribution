package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content603Headers extends StObject {
  
  var parameters: `434`
  
  var responses: `200Content603Headers`
}
object Responses200Content603Headers {
  
  inline def apply(parameters: `434`, responses: `200Content603Headers`): Responses200Content603Headers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content603Headers]
  }
  
  extension [Self <: Responses200Content603Headers](x: Self) {
    
    inline def setParameters(value: `434`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content603Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
