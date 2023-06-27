package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters292Responses11 extends StObject {
  
  var parameters: `292`
  
  var responses: `11`
}
object Parameters292Responses11 {
  
  inline def apply(parameters: `292`, responses: `11`): Parameters292Responses11 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters292Responses11]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters292Responses11] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `292`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `11`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
