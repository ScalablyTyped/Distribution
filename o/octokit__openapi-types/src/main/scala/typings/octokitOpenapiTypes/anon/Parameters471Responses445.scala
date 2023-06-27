package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters471Responses445 extends StObject {
  
  var parameters: `471`
  
  var responses: `445`
}
object Parameters471Responses445 {
  
  inline def apply(parameters: `471`, responses: `445`): Parameters471Responses445 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters471Responses445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters471Responses445] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `471`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `445`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
