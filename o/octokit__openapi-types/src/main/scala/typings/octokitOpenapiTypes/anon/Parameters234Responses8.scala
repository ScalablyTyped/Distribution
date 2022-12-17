package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters234Responses8 extends StObject {
  
  var parameters: `234`
  
  var responses: `8`
}
object Parameters234Responses8 {
  
  inline def apply(parameters: `234`, responses: `8`): Parameters234Responses8 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters234Responses8]
  }
  
  extension [Self <: Parameters234Responses8](x: Self) {
    
    inline def setParameters(value: `234`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
