package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters607 extends StObject {
  
  var parameters: `607`
  
  var responses: `200Content608`
}
object Parameters607 {
  
  inline def apply(parameters: `607`, responses: `200Content608`): Parameters607 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters607]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters607] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `607`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content608`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
