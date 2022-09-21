package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodyHtmlurl extends StObject {
  
  var parameters: PathKey
  
  var responses: `200ContentApplicationjsonBodyHtmlurl`
}
object Responses200ContentApplicationjsonBodyHtmlurl {
  
  inline def apply(parameters: PathKey, responses: `200ContentApplicationjsonBodyHtmlurl`): Responses200ContentApplicationjsonBodyHtmlurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodyHtmlurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBodyHtmlurl](x: Self) {
    
    inline def setParameters(value: PathKey): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodyHtmlurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
