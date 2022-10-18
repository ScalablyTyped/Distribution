package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters76 extends StObject {
  
  var parameters: `76`
  
  var responses: `200301`
}
object Parameters76 {
  
  inline def apply(parameters: `76`, responses: `200301`): Parameters76 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters76]
  }
  
  extension [Self <: Parameters76](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
