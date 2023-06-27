package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters367 extends StObject {
  
  var parameters: `367`
  
  var responses: `200Content368`
}
object Parameters367 {
  
  inline def apply(parameters: `367`, responses: `200Content368`): Parameters367 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters367]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters367] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `367`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content368`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
