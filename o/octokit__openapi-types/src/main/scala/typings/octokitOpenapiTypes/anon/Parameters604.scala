package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters604 extends StObject {
  
  var parameters: `604`
  
  var responses: `200Content570`
}
object Parameters604 {
  
  inline def apply(parameters: `604`, responses: `200Content570`): Parameters604 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters604]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters604] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `604`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content570`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
