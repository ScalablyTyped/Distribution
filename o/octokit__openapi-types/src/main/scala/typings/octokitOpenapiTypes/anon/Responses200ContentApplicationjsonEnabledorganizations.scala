package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonEnabledorganizations extends StObject {
  
  var parameters: PathEnterprise
  
  var responses: `200ContentApplicationjsonEnabledorganizations`
}
object Responses200ContentApplicationjsonEnabledorganizations {
  
  inline def apply(parameters: PathEnterprise, responses: `200ContentApplicationjsonEnabledorganizations`): Responses200ContentApplicationjsonEnabledorganizations = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonEnabledorganizations]
  }
  
  extension [Self <: Responses200ContentApplicationjsonEnabledorganizations](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEnabledorganizations`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
