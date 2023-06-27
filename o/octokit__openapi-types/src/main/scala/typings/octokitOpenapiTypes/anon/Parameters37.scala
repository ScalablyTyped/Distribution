package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters37 extends StObject {
  
  var parameters: `37`
  
  var responses: `200Content38`
}
object Parameters37 {
  
  inline def apply(parameters: `37`, responses: `200Content38`): Parameters37 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters37]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters37] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content38`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
