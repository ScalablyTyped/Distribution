package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters396 extends StObject {
  
  var parameters: `396`
  
  var responses: `200Content397`
}
object Parameters396 {
  
  inline def apply(parameters: `396`, responses: `200Content397`): Parameters396 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters396]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters396] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `396`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
