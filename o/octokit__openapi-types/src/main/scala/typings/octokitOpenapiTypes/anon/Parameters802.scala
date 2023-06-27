package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters802 extends StObject {
  
  var parameters: `802`
  
  var responses: `200Content615`
}
object Parameters802 {
  
  inline def apply(parameters: `802`, responses: `200Content615`): Parameters802 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters802]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters802] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `802`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content615`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
