package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters216 extends StObject {
  
  var parameters: `216`
  
  var responses: `200Content54`
}
object Parameters216 {
  
  inline def apply(parameters: `216`, responses: `200Content54`): Parameters216 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters216]
  }
  
  extension [Self <: Parameters216](x: Self) {
    
    inline def setParameters(value: `216`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content54`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
