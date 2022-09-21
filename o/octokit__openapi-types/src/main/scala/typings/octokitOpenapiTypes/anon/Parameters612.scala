package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters612 extends StObject {
  
  var parameters: `612`
  
  var responses: `613`
}
object Parameters612 {
  
  inline def apply(parameters: `612`, responses: `613`): Parameters612 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters612]
  }
  
  extension [Self <: Parameters612](x: Self) {
    
    inline def setParameters(value: `612`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `613`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
