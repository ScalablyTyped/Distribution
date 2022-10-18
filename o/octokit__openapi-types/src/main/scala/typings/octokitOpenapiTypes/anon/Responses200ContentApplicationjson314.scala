package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson314 extends StObject {
  
  var parameters: Path300
  
  var responses: `200ContentApplicationjson314`
}
object Responses200ContentApplicationjson314 {
  
  inline def apply(parameters: Path300, responses: `200ContentApplicationjson314`): Responses200ContentApplicationjson314 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson314]
  }
  
  extension [Self <: Responses200ContentApplicationjson314](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson314`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
