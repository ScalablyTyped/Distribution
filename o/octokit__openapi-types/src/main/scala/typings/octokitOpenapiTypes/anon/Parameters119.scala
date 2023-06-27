package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters119 extends StObject {
  
  var parameters: `119`
  
  var responses: `200Content120`
}
object Parameters119 {
  
  inline def apply(parameters: `119`, responses: `200Content120`): Parameters119 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters119]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters119] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `119`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content120`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
