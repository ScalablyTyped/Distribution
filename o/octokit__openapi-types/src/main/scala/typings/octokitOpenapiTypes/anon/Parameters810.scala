package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters810 extends StObject {
  
  var parameters: `810`
  
  var responses: `200Content563422Content414`
}
object Parameters810 {
  
  inline def apply(parameters: `810`, responses: `200Content563422Content414`): Parameters810 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters810]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters810] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `810`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content563422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
