package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson650 extends StObject {
  
  var parameters: Query473
  
  var responses: `200ContentApplicationjson650`
}
object Responses200ContentApplicationjson650 {
  
  inline def apply(parameters: Query473, responses: `200ContentApplicationjson650`): Responses200ContentApplicationjson650 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson650]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjson650] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson650`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
