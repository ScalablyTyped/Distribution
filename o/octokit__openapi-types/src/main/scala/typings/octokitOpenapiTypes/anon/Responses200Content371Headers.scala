package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content371Headers extends StObject {
  
  var parameters: `34`
  
  var responses: `200Content371Headers`
}
object Responses200Content371Headers {
  
  inline def apply(parameters: `34`, responses: `200Content371Headers`): Responses200Content371Headers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content371Headers]
  }
  
  extension [Self <: Responses200Content371Headers](x: Self) {
    
    inline def setParameters(value: `34`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content371Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
