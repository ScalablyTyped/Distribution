package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters516 extends StObject {
  
  var parameters: `516`
  
  var responses: `200Content517`
}
object Parameters516 {
  
  inline def apply(parameters: `516`, responses: `200Content517`): Parameters516 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters516]
  }
  
  extension [Self <: Parameters516](x: Self) {
    
    inline def setParameters(value: `516`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content517`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
