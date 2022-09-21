package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters144Responses409Unknown extends StObject {
  
  var parameters: `144`
  
  var responses: `409Unknown`
}
object Parameters144Responses409Unknown {
  
  inline def apply(parameters: `144`, responses: `409Unknown`): Parameters144Responses409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters144Responses409Unknown]
  }
  
  extension [Self <: Parameters144Responses409Unknown](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
