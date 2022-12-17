package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters472 extends StObject {
  
  var parameters: `472`
  
  var responses: `200301403`
}
object Parameters472 {
  
  inline def apply(parameters: `472`, responses: `200301403`): Parameters472 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters472]
  }
  
  extension [Self <: Parameters472](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
