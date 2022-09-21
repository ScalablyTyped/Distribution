package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson453 extends StObject {
  
  var parameters: PathOrgStringQuery426
  
  var responses: `200ContentApplicationjson453`
}
object Responses200ContentApplicationjson453 {
  
  inline def apply(parameters: PathOrgStringQuery426, responses: `200ContentApplicationjson453`): Responses200ContentApplicationjson453 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson453]
  }
  
  extension [Self <: Responses200ContentApplicationjson453](x: Self) {
    
    inline def setParameters(value: PathOrgStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson453`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
