package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjson extends StObject {
  
  var parameters: PathCheckrunid
  
  var responses: `403ContentApplicationjson`
}
object Responses403ContentApplicationjson {
  
  inline def apply(parameters: PathCheckrunid, responses: `403ContentApplicationjson`): Responses403ContentApplicationjson = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjson]
  }
  
  extension [Self <: Responses403ContentApplicationjson](x: Self) {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
