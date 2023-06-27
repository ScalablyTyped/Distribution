package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters575 extends StObject {
  
  var parameters: `575`
  
  var responses: `200Content576`
}
object Parameters575 {
  
  inline def apply(parameters: `575`, responses: `200Content576`): Parameters575 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters575]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters575] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `575`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content576`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
