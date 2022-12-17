package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters135Responses404Unknown extends StObject {
  
  var parameters: `135`
  
  var responses: `404Unknown`
}
object Parameters135Responses404Unknown {
  
  inline def apply(parameters: `135`, responses: `404Unknown`): Parameters135Responses404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters135Responses404Unknown]
  }
  
  extension [Self <: Parameters135Responses404Unknown](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
