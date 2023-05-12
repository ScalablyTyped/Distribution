package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters141Responses200Content73 extends StObject {
  
  var parameters: `141`
  
  var responses: `200Content73`
}
object Parameters141Responses200Content73 {
  
  inline def apply(parameters: `141`, responses: `200Content73`): Parameters141Responses200Content73 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters141Responses200Content73]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters141Responses200Content73] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content73`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
