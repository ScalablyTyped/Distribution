package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters81 extends StObject {
  
  var parameters: `81`
  
  var responses: `404503`
}
object Parameters81 {
  
  inline def apply(parameters: `81`, responses: `404503`): Parameters81 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters81]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters81] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `81`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
