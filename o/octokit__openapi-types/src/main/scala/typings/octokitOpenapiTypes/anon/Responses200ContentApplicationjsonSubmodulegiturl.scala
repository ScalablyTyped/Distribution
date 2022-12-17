package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSubmodulegiturl extends StObject {
  
  var parameters: PathOwnerStringQuery188
  
  var responses: `200ContentApplicationjsonSubmodulegiturl`
}
object Responses200ContentApplicationjsonSubmodulegiturl {
  
  inline def apply(parameters: PathOwnerStringQuery188, responses: `200ContentApplicationjsonSubmodulegiturl`): Responses200ContentApplicationjsonSubmodulegiturl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSubmodulegiturl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSubmodulegiturl](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery188): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSubmodulegiturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
