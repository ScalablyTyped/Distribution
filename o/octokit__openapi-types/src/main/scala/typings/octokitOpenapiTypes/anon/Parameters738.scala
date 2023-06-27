package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters738 extends StObject {
  
  var parameters: `738`
  
  var responses: `200Content681304`
}
object Parameters738 {
  
  inline def apply(parameters: `738`, responses: `200Content681304`): Parameters738 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters738]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters738] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `738`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content681304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
