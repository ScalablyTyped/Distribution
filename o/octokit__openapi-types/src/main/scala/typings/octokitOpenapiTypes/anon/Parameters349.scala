package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters349 extends StObject {
  
  var parameters: `349`
  
  var responses: `200Content350`
}
object Parameters349 {
  
  inline def apply(parameters: `349`, responses: `200Content350`): Parameters349 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters349]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters349] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `349`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content350`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
