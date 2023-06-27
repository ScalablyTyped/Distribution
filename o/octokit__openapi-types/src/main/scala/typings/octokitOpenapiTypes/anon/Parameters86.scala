package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters86 extends StObject {
  
  var parameters: `86`
  
  var responses: `304400`
}
object Parameters86 {
  
  inline def apply(parameters: `86`, responses: `304400`): Parameters86 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters86]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters86] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `86`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
