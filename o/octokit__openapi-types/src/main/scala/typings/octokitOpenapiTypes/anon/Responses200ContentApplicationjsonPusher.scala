package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonPusher extends StObject {
  
  var parameters: `472`
  
  var responses: `200ContentApplicationjsonPusher`
}
object Responses200ContentApplicationjsonPusher {
  
  inline def apply(parameters: `472`, responses: `200ContentApplicationjsonPusher`): Responses200ContentApplicationjsonPusher = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonPusher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonPusher] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonPusher`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
