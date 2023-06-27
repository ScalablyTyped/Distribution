package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters656 extends StObject {
  
  var parameters: `656`
  
  var responses: `200Content657`
}
object Parameters656 {
  
  inline def apply(parameters: `656`, responses: `200Content657`): Parameters656 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters656]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters656] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `656`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content657`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
