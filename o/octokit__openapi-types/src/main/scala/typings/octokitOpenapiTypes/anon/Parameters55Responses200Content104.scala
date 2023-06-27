package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters55Responses200Content104 extends StObject {
  
  var parameters: `55`
  
  var responses: `200Content104`
}
object Parameters55Responses200Content104 {
  
  inline def apply(parameters: `55`, responses: `200Content104`): Parameters55Responses200Content104 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters55Responses200Content104]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters55Responses200Content104] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content104`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
