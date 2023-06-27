package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters812 extends StObject {
  
  var parameters: `812`
  
  var responses: `200ContentApplicationjson523`
}
object Parameters812 {
  
  inline def apply(parameters: `812`, responses: `200ContentApplicationjson523`): Parameters812 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters812]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters812] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `812`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson523`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
