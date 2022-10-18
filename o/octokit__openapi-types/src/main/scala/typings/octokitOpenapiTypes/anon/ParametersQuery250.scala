package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery250 extends StObject {
  
  var parameters: Query250
  
  var responses: `200ContentApplicationjsonOrganizationsTotalcount`
}
object ParametersQuery250 {
  
  inline def apply(parameters: Query250, responses: `200ContentApplicationjsonOrganizationsTotalcount`): ParametersQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery250]
  }
  
  extension [Self <: ParametersQuery250](x: Self) {
    
    inline def setParameters(value: Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
