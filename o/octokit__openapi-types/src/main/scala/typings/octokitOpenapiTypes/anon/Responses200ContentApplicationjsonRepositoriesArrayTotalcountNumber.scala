package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber extends StObject {
  
  var parameters: PathOrgStringQuery426
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
}
object Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber {
  
  inline def apply(
    parameters: PathOrgStringQuery426,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
  ): Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber](x: Self) {
    
    inline def setParameters(value: PathOrgStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
