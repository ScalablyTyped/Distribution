package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters759 extends StObject {
  
  var parameters: `759`
  
  var responses: `200Content760`
}
object Parameters759 {
  
  inline def apply(parameters: `759`, responses: `200Content760`): Parameters759 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters759]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters759] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `759`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content760`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
