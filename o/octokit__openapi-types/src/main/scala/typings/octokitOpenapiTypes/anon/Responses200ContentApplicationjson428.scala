package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson428 extends StObject {
  
  var parameters: Path292
  
  var responses: `200ContentApplicationjson428`
}
object Responses200ContentApplicationjson428 {
  
  inline def apply(parameters: Path292, responses: `200ContentApplicationjson428`): Responses200ContentApplicationjson428 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson428]
  }
  
  extension [Self <: Responses200ContentApplicationjson428](x: Self) {
    
    inline def setParameters(value: Path292): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson428`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
