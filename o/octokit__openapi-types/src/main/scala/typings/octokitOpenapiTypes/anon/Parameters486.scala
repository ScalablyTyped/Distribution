package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters486 extends StObject {
  
  var parameters: `486`
  
  var responses: `200Content487`
}
object Parameters486 {
  
  inline def apply(parameters: `486`, responses: `200Content487`): Parameters486 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters486]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters486] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `486`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content487`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
