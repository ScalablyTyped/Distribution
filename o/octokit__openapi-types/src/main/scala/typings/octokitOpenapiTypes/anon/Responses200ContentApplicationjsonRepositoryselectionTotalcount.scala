package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoryselectionTotalcount extends StObject {
  
  var parameters: `434`
  
  var responses: `200ContentApplicationjsonRepositoryselectionTotalcount`
}
object Responses200ContentApplicationjsonRepositoryselectionTotalcount {
  
  inline def apply(parameters: `434`, responses: `200ContentApplicationjsonRepositoryselectionTotalcount`): Responses200ContentApplicationjsonRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoryselectionTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositoryselectionTotalcount](x: Self) {
    
    inline def setParameters(value: `434`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoryselectionTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
