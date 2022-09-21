package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson364 extends StObject {
  
  var parameters: `34`
  
  var responses: `200ContentApplicationjson364`
}
object Responses200ContentApplicationjson364 {
  
  inline def apply(parameters: `34`, responses: `200ContentApplicationjson364`): Responses200ContentApplicationjson364 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson364]
  }
  
  extension [Self <: Responses200ContentApplicationjson364](x: Self) {
    
    inline def setParameters(value: `34`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson364`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
