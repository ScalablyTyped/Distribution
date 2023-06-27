package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters803 extends StObject {
  
  var parameters: `803`
  
  var responses: `200Content804`
}
object Parameters803 {
  
  inline def apply(parameters: `803`, responses: `200Content804`): Parameters803 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters803]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters803] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `803`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content804`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
