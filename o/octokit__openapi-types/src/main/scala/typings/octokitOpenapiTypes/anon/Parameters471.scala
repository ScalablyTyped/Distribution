package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters471 extends StObject {
  
  var parameters: `471`
  
  var responses: `50`
}
object Parameters471 {
  
  inline def apply(parameters: `471`, responses: `50`): Parameters471 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters471]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters471] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `471`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `50`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
