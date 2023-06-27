package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson788 extends StObject {
  
  var parameters: `553`
  
  var responses: `200ContentApplicationjson788`
}
object Responses200ContentApplicationjson788 {
  
  inline def apply(parameters: `553`, responses: `200ContentApplicationjson788`): Responses200ContentApplicationjson788 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson788]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjson788] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `553`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson788`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
