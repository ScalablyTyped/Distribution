package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSecrets extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `200ContentApplicationjsonSecrets`
}
object Responses200ContentApplicationjsonSecrets {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `200ContentApplicationjsonSecrets`): Responses200ContentApplicationjsonSecrets = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSecrets]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSecrets](x: Self) {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecrets`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
