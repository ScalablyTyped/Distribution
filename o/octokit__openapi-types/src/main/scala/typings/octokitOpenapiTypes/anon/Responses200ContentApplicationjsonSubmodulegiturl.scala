package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSubmodulegiturl extends StObject {
  
  var parameters: `672`
  
  var responses: `200ContentApplicationjsonSubmodulegiturl`
}
object Responses200ContentApplicationjsonSubmodulegiturl {
  
  inline def apply(parameters: `672`, responses: `200ContentApplicationjsonSubmodulegiturl`): Responses200ContentApplicationjsonSubmodulegiturl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSubmodulegiturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonSubmodulegiturl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `672`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSubmodulegiturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
