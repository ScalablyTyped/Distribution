package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters466 extends StObject {
  
  var parameters: `466`
  
  var responses: `404Content55`
}
object Parameters466 {
  
  inline def apply(parameters: `466`, responses: `404Content55`): Parameters466 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters466]
  }
  
  extension [Self <: Parameters466](x: Self) {
    
    inline def setParameters(value: `466`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
