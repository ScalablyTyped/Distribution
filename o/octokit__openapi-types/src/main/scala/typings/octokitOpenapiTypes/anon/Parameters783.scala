package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters783 extends StObject {
  
  var parameters: `783`
  
  var responses: `631`
}
object Parameters783 {
  
  inline def apply(parameters: `783`, responses: `631`): Parameters783 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters783]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters783] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `783`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `631`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
