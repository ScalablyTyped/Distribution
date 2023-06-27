package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters659 extends StObject {
  
  var parameters: `659`
  
  var responses: `200Content660`
}
object Parameters659 {
  
  inline def apply(parameters: `659`, responses: `200Content660`): Parameters659 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters659]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters659] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `659`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content660`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
