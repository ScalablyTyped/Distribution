package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters816 extends StObject {
  
  var parameters: `816`
  
  var responses: `620`
}
object Parameters816 {
  
  inline def apply(parameters: `816`, responses: `620`): Parameters816 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters816]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters816] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `816`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `620`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
