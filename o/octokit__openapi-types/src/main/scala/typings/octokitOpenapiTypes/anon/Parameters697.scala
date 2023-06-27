package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters697 extends StObject {
  
  var parameters: `697`
  
  var responses: `400ContentApplicationjsonApplicationscimjson`
}
object Parameters697 {
  
  inline def apply(parameters: `697`, responses: `400ContentApplicationjsonApplicationscimjson`): Parameters697 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters697]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters697] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `697`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400ContentApplicationjsonApplicationscimjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
