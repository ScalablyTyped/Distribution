package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters595 extends StObject {
  
  var parameters: `595`
  
  var responses: `304400403`
}
object Parameters595 {
  
  inline def apply(parameters: `595`, responses: `304400403`): Parameters595 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters595]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters595] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `595`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
