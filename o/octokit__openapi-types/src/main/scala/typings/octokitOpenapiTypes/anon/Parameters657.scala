package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters657 extends StObject {
  
  var parameters: `657`
  
  var responses: `200Content487304`
}
object Parameters657 {
  
  inline def apply(parameters: `657`, responses: `200Content487304`): Parameters657 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters657]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters657] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `657`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content487304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
