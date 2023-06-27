package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters699Responses557 extends StObject {
  
  var parameters: `699`
  
  var responses: `557`
}
object Parameters699Responses557 {
  
  inline def apply(parameters: `699`, responses: `557`): Parameters699Responses557 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters699Responses557]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters699Responses557] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `699`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `557`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
