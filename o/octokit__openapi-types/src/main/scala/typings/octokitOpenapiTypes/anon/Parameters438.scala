package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters438 extends StObject {
  
  var parameters: `438`
  
  var responses: `200Content138`
}
object Parameters438 {
  
  inline def apply(parameters: `438`, responses: `200Content138`): Parameters438 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters438]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters438] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `438`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content138`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
