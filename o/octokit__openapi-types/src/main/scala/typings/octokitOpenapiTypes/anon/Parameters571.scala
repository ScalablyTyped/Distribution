package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters571 extends StObject {
  
  var parameters: `571`
  
  var responses: `200Content572`
}
object Parameters571 {
  
  inline def apply(parameters: `571`, responses: `200Content572`): Parameters571 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters571]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters571] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `571`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content572`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
