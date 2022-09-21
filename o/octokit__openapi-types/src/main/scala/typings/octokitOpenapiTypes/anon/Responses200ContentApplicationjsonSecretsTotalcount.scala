package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSecretsTotalcount extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `200ContentApplicationjsonSecretsTotalcount`
}
object Responses200ContentApplicationjsonSecretsTotalcount {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `200ContentApplicationjsonSecretsTotalcount`): Responses200ContentApplicationjsonSecretsTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSecretsTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSecretsTotalcount](x: Self) {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecretsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
