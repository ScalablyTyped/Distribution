package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters593 extends StObject {
  
  var parameters: `593`
  
  var responses: `200Content594`
}
object Parameters593 {
  
  inline def apply(parameters: `593`, responses: `200Content594`): Parameters593 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters593]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters593] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `593`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content594`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
