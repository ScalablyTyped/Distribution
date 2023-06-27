package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters437 extends StObject {
  
  var parameters: `437`
  
  var responses: `200Content74`
}
object Parameters437 {
  
  inline def apply(parameters: `437`, responses: `200Content74`): Parameters437 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters437]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters437] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `437`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content74`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
