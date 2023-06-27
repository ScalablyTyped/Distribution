package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters205 extends StObject {
  
  var parameters: `205`
  
  var responses: `200Content206`
}
object Parameters205 {
  
  inline def apply(parameters: `205`, responses: `200Content206`): Parameters205 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters205]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters205] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `205`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content206`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
