package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters135 extends StObject {
  
  var parameters: `135`
  
  var responses: `200301`
}
object Parameters135 {
  
  inline def apply(parameters: `135`, responses: `200301`): Parameters135 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters135]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters135] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
