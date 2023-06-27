package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters782 extends StObject {
  
  var parameters: `782`
  
  var responses: `200Content628`
}
object Parameters782 {
  
  inline def apply(parameters: `782`, responses: `200Content628`): Parameters782 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters782]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters782] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `782`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content628`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
