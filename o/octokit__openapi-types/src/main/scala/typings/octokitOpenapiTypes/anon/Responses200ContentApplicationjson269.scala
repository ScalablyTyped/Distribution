package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson269 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200ContentApplicationjson269`
}
object Responses200ContentApplicationjson269 {
  
  inline def apply(parameters: PathOwner, responses: `200ContentApplicationjson269`): Responses200ContentApplicationjson269 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson269]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjson269] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson269`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
