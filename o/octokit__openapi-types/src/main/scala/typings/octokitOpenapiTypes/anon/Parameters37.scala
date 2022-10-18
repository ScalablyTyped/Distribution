package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters37 extends StObject {
  
  var parameters: `37`
  
  var responses: `200ContentApplicationjsonKeyid`
}
object Parameters37 {
  
  inline def apply(parameters: `37`, responses: `200ContentApplicationjsonKeyid`): Parameters37 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters37]
  }
  
  extension [Self <: Parameters37](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
