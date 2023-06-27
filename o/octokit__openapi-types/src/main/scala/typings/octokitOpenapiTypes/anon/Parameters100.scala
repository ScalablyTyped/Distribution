package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters100 extends StObject {
  
  var parameters: `100`
  
  var responses: `200Content36`
}
object Parameters100 {
  
  inline def apply(parameters: `100`, responses: `200Content36`): Parameters100 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters100]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters100] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `100`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
