package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberOwnerQuery250 extends StObject {
  
  var parameters: PathAttemptnumberOwnerQuery250
  
  var responses: `200ContentApplicationjsonJobsTotalcount`
}
object ParametersPathAttemptnumberOwnerQuery250 {
  
  inline def apply(parameters: PathAttemptnumberOwnerQuery250, responses: `200ContentApplicationjsonJobsTotalcount`): ParametersPathAttemptnumberOwnerQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberOwnerQuery250]
  }
  
  extension [Self <: ParametersPathAttemptnumberOwnerQuery250](x: Self) {
    
    inline def setParameters(value: PathAttemptnumberOwnerQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonJobsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
