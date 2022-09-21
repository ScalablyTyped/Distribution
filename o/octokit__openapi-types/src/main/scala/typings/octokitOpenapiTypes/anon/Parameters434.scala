package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters434 extends StObject {
  
  var parameters: `434`
  
  var responses: `403503`
}
object Parameters434 {
  
  inline def apply(parameters: `434`, responses: `403503`): Parameters434 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters434]
  }
  
  extension [Self <: Parameters434](x: Self) {
    
    inline def setParameters(value: `434`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
