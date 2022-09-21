package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonTotalcount extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200ContentApplicationjsonTotalcount`
}
object Responses200ContentApplicationjsonTotalcount {
  
  inline def apply(parameters: QueryPage, responses: `200ContentApplicationjsonTotalcount`): Responses200ContentApplicationjsonTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonTotalcount](x: Self) {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
