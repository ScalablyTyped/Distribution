package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson411 extends StObject {
  
  var parameters: Query407
  
  var responses: `200ContentApplicationjson411`
}
object Responses200ContentApplicationjson411 {
  
  inline def apply(parameters: Query407, responses: `200ContentApplicationjson411`): Responses200ContentApplicationjson411 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson411]
  }
  
  extension [Self <: Responses200ContentApplicationjson411](x: Self) {
    
    inline def setParameters(value: Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson411`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
