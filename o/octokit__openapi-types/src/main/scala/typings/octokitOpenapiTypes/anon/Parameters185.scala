package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters185 extends StObject {
  
  var parameters: `185`
  
  var responses: `186`
}
object Parameters185 {
  
  inline def apply(parameters: `185`, responses: `186`): Parameters185 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters185]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters185] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `185`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `186`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
