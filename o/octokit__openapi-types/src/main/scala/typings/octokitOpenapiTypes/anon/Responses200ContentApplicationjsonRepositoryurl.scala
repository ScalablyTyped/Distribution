package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoryurl extends StObject {
  
  var parameters: `76`
  
  var responses: `200ContentApplicationjsonRepositoryurl`
}
object Responses200ContentApplicationjsonRepositoryurl {
  
  inline def apply(parameters: `76`, responses: `200ContentApplicationjsonRepositoryurl`): Responses200ContentApplicationjsonRepositoryurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoryurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositoryurl](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoryurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
