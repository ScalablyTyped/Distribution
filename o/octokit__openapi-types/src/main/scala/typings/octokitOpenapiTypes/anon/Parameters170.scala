package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters170 extends StObject {
  
  var parameters: `170`
  
  var responses: `200Content171`
}
object Parameters170 {
  
  inline def apply(parameters: `170`, responses: `200Content171`): Parameters170 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters170]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters170] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `170`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content171`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
