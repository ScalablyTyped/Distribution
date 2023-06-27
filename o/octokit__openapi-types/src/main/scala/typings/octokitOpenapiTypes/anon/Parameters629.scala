package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters629 extends StObject {
  
  var parameters: `629`
  
  var responses: `200Content628`
}
object Parameters629 {
  
  inline def apply(parameters: `629`, responses: `200Content628`): Parameters629 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters629]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters629] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `629`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content628`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
