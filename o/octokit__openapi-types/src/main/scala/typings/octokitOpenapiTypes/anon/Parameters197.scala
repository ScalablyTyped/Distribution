package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters197 extends StObject {
  
  var parameters: `197`
  
  var responses: `200Content198`
}
object Parameters197 {
  
  inline def apply(parameters: `197`, responses: `200Content198`): Parameters197 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters197]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters197] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `197`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content198`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
