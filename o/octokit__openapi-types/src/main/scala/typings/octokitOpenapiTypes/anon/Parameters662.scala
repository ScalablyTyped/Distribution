package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters662 extends StObject {
  
  var parameters: `662`
  
  var responses: `304401Content36`
}
object Parameters662 {
  
  inline def apply(parameters: `662`, responses: `304401Content36`): Parameters662 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters662]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters662] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `662`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
