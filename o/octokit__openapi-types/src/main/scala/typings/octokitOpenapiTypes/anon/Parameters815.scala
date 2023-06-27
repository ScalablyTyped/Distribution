package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters815 extends StObject {
  
  var parameters: `815`
  
  var responses: `200Content618422Content414`
}
object Parameters815 {
  
  inline def apply(parameters: `815`, responses: `200Content618422Content414`): Parameters815 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters815]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters815] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `815`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content618422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
