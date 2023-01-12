package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBillingemail extends StObject {
  
  var parameters: `433`
  
  var responses: `200ContentApplicationjsonBillingemail`
}
object Responses200ContentApplicationjsonBillingemail {
  
  inline def apply(parameters: `433`, responses: `200ContentApplicationjsonBillingemail`): Responses200ContentApplicationjsonBillingemail = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBillingemail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBillingemail] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBillingemail`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
