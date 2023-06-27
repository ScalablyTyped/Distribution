package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters461 extends StObject {
  
  var parameters: `461`
  
  var responses: `200Content36304`
}
object Parameters461 {
  
  inline def apply(parameters: `461`, responses: `200Content36304`): Parameters461 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters461]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters461] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `461`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content36304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
