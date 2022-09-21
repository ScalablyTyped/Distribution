package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson452401Content55 extends StObject {
  
  var parameters: Path602
  
  var responses: `200ContentApplicationjson452401Content55`
}
object Responses200ContentApplicationjson452401Content55 {
  
  inline def apply(parameters: Path602, responses: `200ContentApplicationjson452401Content55`): Responses200ContentApplicationjson452401Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson452401Content55]
  }
  
  extension [Self <: Responses200ContentApplicationjson452401Content55](x: Self) {
    
    inline def setParameters(value: Path602): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson452401Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
