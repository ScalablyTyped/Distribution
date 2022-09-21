package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters535Responses422Content421 extends StObject {
  
  var parameters: `535`
  
  var responses: `422Content421`
}
object Parameters535Responses422Content421 {
  
  inline def apply(parameters: `535`, responses: `422Content421`): Parameters535Responses422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters535Responses422Content421]
  }
  
  extension [Self <: Parameters535Responses422Content421](x: Self) {
    
    inline def setParameters(value: `535`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
