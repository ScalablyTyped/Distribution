package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonPusher extends StObject {
  
  var parameters: `491`
  
  var responses: `200ContentApplicationjsonPusher`
}
object Responses200ContentApplicationjsonPusher {
  
  inline def apply(parameters: `491`, responses: `200ContentApplicationjsonPusher`): Responses200ContentApplicationjsonPusher = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonPusher]
  }
  
  extension [Self <: Responses200ContentApplicationjsonPusher](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonPusher`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
