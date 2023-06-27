package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters775 extends StObject {
  
  var parameters: `775`
  
  var responses: `200Content583Headers28`
}
object Parameters775 {
  
  inline def apply(parameters: `775`, responses: `200Content583Headers28`): Parameters775 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters775]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters775] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `775`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content583Headers28`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
