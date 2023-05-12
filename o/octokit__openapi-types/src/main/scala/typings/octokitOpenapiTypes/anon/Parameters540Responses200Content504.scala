package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters540Responses200Content504 extends StObject {
  
  var parameters: `540`
  
  var responses: `200Content504`
}
object Parameters540Responses200Content504 {
  
  inline def apply(parameters: `540`, responses: `200Content504`): Parameters540Responses200Content504 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters540Responses200Content504]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters540Responses200Content504] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content504`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
