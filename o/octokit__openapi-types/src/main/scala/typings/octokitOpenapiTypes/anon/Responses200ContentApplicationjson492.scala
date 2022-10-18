package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson492 extends StObject {
  
  var parameters: Path292
  
  var responses: `200ContentApplicationjson492`
}
object Responses200ContentApplicationjson492 {
  
  inline def apply(parameters: Path292, responses: `200ContentApplicationjson492`): Responses200ContentApplicationjson492 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson492]
  }
  
  extension [Self <: Responses200ContentApplicationjson492](x: Self) {
    
    inline def setParameters(value: Path292): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson492`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
