package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters141 extends StObject {
  
  var parameters: `141`
  
  var responses: `200301`
}
object Parameters141 {
  
  inline def apply(parameters: `141`, responses: `200301`): Parameters141 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters141]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters141] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
