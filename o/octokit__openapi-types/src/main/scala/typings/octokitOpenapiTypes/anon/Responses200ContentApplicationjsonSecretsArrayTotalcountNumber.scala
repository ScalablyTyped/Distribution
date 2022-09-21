package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSecretsArrayTotalcountNumber extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200ContentApplicationjsonSecretsArrayTotalcountNumber`
}
object Responses200ContentApplicationjsonSecretsArrayTotalcountNumber {
  
  inline def apply(parameters: PathOwner, responses: `200ContentApplicationjsonSecretsArrayTotalcountNumber`): Responses200ContentApplicationjsonSecretsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSecretsArrayTotalcountNumber]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSecretsArrayTotalcountNumber](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecretsArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
