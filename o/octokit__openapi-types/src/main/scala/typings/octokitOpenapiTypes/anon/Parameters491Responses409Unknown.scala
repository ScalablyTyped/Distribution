package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters491Responses409Unknown extends StObject {
  
  var parameters: `491`
  
  var responses: `409Unknown`
}
object Parameters491Responses409Unknown {
  
  inline def apply(parameters: `491`, responses: `409Unknown`): Parameters491Responses409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters491Responses409Unknown]
  }
  
  extension [Self <: Parameters491Responses409Unknown](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
