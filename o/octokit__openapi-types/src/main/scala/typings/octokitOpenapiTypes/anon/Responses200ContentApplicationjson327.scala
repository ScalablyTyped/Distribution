package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson327 extends StObject {
  
  var parameters: Path300
  
  var responses: `200ContentApplicationjson327`
}
object Responses200ContentApplicationjson327 {
  
  inline def apply(parameters: Path300, responses: `200ContentApplicationjson327`): Responses200ContentApplicationjson327 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson327]
  }
  
  extension [Self <: Responses200ContentApplicationjson327](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson327`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
