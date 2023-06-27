package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters674 extends StObject {
  
  var parameters: `674`
  
  var responses: `200ContentApplicationjsonDefaults`
}
object Parameters674 {
  
  inline def apply(parameters: `674`, responses: `200ContentApplicationjsonDefaults`): Parameters674 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters674]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters674] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `674`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDefaults`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
