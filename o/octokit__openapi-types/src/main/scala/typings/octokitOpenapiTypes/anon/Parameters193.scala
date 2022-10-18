package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters193 extends StObject {
  
  var parameters: `193`
  
  var responses: `200ContentApplicationjsonKeyid`
}
object Parameters193 {
  
  inline def apply(parameters: `193`, responses: `200ContentApplicationjsonKeyid`): Parameters193 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters193]
  }
  
  extension [Self <: Parameters193](x: Self) {
    
    inline def setParameters(value: `193`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
