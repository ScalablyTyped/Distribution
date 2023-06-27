package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters97 extends StObject {
  
  var parameters: `97`
  
  var responses: `200Content90`
}
object Parameters97 {
  
  inline def apply(parameters: `97`, responses: `200Content90`): Parameters97 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters97] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `97`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content90`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
