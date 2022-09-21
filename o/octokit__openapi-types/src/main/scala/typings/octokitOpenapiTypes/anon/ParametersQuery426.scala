package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery426 extends StObject {
  
  var parameters: Query426
  
  var responses: `200ContentApplicationjsonOrganizationsTotalcount`
}
object ParametersQuery426 {
  
  inline def apply(parameters: Query426, responses: `200ContentApplicationjsonOrganizationsTotalcount`): ParametersQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery426]
  }
  
  extension [Self <: ParametersQuery426](x: Self) {
    
    inline def setParameters(value: Query426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
