package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters376 extends StObject {
  
  var parameters: `376`
  
  var responses: `200Content51304`
}
object Parameters376 {
  
  inline def apply(parameters: `376`, responses: `200Content51304`): Parameters376 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters376]
  }
  
  extension [Self <: Parameters376](x: Self) {
    
    inline def setParameters(value: `376`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content51304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
