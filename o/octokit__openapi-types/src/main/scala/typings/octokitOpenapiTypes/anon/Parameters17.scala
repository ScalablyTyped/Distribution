package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters17 extends StObject {
  
  var parameters: `17`
  
  var responses: `304403`
}
object Parameters17 {
  
  inline def apply(parameters: `17`, responses: `304403`): Parameters17 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters17]
  }
  
  extension [Self <: Parameters17](x: Self) {
    
    inline def setParameters(value: `17`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
