package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters266 extends StObject {
  
  var parameters: `266`
  
  var responses: `200304400`
}
object Parameters266 {
  
  inline def apply(parameters: `266`, responses: `200304400`): Parameters266 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters266]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters266] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `266`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
