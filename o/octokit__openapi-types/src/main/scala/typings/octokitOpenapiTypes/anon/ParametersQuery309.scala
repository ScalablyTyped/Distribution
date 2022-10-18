package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery309 extends StObject {
  
  var parameters: Query309
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
}
object ParametersQuery309 {
  
  inline def apply(parameters: Query309, responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): ParametersQuery309 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery309]
  }
  
  extension [Self <: ParametersQuery309](x: Self) {
    
    inline def setParameters(value: Query309): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
