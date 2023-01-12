package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters135Responses201Content21 extends StObject {
  
  var parameters: `135`
  
  var responses: `201Content21`
}
object Parameters135Responses201Content21 {
  
  inline def apply(parameters: `135`, responses: `201Content21`): Parameters135Responses201Content21 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters135Responses201Content21]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters135Responses201Content21] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content21`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
