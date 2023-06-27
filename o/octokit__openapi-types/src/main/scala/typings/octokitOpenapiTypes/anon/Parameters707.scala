package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters707 extends StObject {
  
  var parameters: `707`
  
  var responses: `200Content708`
}
object Parameters707 {
  
  inline def apply(parameters: `707`, responses: `200Content708`): Parameters707 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters707]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters707] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `707`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content708`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
