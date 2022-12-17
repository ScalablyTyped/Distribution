package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters472Responses409Unknown extends StObject {
  
  var parameters: `472`
  
  var responses: `409Unknown`
}
object Parameters472Responses409Unknown {
  
  inline def apply(parameters: `472`, responses: `409Unknown`): Parameters472Responses409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters472Responses409Unknown]
  }
  
  extension [Self <: Parameters472Responses409Unknown](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
