package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters144Responses362 extends StObject {
  
  var parameters: `144`
  
  var responses: `362`
}
object Parameters144Responses362 {
  
  inline def apply(parameters: `144`, responses: `362`): Parameters144Responses362 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters144Responses362]
  }
  
  extension [Self <: Parameters144Responses362](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `362`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
