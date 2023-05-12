package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters141Responses201Content62 extends StObject {
  
  var parameters: `141`
  
  var responses: `201Content62`
}
object Parameters141Responses201Content62 {
  
  inline def apply(parameters: `141`, responses: `201Content62`): Parameters141Responses201Content62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters141Responses201Content62]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters141Responses201Content62] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content62`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
