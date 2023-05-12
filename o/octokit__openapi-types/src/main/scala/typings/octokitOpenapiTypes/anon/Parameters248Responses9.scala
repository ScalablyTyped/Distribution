package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters248Responses9 extends StObject {
  
  var parameters: `248`
  
  var responses: `9`
}
object Parameters248Responses9 {
  
  inline def apply(parameters: `248`, responses: `9`): Parameters248Responses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters248Responses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters248Responses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `248`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
