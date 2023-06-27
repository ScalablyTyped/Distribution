package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters743 extends StObject {
  
  var parameters: `743`
  
  var responses: `200Content679`
}
object Parameters743 {
  
  inline def apply(parameters: `743`, responses: `200Content679`): Parameters743 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters743]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters743] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `743`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content679`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
