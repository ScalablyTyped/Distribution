package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters757 extends StObject {
  
  var parameters: `757`
  
  var responses: `200Content758`
}
object Parameters757 {
  
  inline def apply(parameters: `757`, responses: `200Content758`): Parameters757 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters757]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters757] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `757`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content758`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
