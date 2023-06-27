package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters717 extends StObject {
  
  var parameters: `717`
  
  var responses: `200Content718`
}
object Parameters717 {
  
  inline def apply(parameters: `717`, responses: `200Content718`): Parameters717 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters717]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters717] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `717`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content718`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
