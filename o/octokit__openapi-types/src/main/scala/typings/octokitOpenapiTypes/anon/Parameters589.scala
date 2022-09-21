package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters589 extends StObject {
  
  var parameters: `589`
  
  var responses: `200Content467HeadersLink`
}
object Parameters589 {
  
  inline def apply(parameters: `589`, responses: `200Content467HeadersLink`): Parameters589 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters589]
  }
  
  extension [Self <: Parameters589](x: Self) {
    
    inline def setParameters(value: `589`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content467HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
