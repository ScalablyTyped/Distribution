package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters128 extends StObject {
  
  var parameters: `128`
  
  var responses: `503`
}
object Parameters128 {
  
  inline def apply(parameters: `128`, responses: `503`): Parameters128 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters128]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters128] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `128`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
