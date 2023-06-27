package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters668 extends StObject {
  
  var parameters: `668`
  
  var responses: `200Content669`
}
object Parameters668 {
  
  inline def apply(parameters: `668`, responses: `200Content669`): Parameters668 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters668]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters668] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `668`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content669`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
