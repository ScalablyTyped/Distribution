package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberOwnerQuery309 extends StObject {
  
  var parameters: PathAlertnumberOwnerQuery309
  
  var responses: `200Content580`
}
object ParametersPathAlertnumberOwnerQuery309 {
  
  inline def apply(parameters: PathAlertnumberOwnerQuery309, responses: `200Content580`): ParametersPathAlertnumberOwnerQuery309 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberOwnerQuery309]
  }
  
  extension [Self <: ParametersPathAlertnumberOwnerQuery309](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwnerQuery309): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content580`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
