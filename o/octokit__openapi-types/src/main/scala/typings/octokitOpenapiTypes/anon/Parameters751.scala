package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters751 extends StObject {
  
  var parameters: `751`
  
  var responses: `200Content628404Content41`
}
object Parameters751 {
  
  inline def apply(parameters: `751`, responses: `200Content628404Content41`): Parameters751 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters751]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters751] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `751`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content628404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
