package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters292 extends StObject {
  
  var parameters: `292`
  
  var responses: `200Content293`
}
object Parameters292 {
  
  inline def apply(parameters: `292`, responses: `200Content293`): Parameters292 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters292]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters292] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `292`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content293`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
