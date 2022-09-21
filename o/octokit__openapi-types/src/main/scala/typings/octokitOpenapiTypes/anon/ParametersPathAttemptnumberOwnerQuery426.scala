package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberOwnerQuery426 extends StObject {
  
  var parameters: PathAttemptnumberOwnerQuery426
  
  var responses: `200ContentApplicationjsonJobsTotalcount`
}
object ParametersPathAttemptnumberOwnerQuery426 {
  
  inline def apply(parameters: PathAttemptnumberOwnerQuery426, responses: `200ContentApplicationjsonJobsTotalcount`): ParametersPathAttemptnumberOwnerQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberOwnerQuery426]
  }
  
  extension [Self <: ParametersPathAttemptnumberOwnerQuery426](x: Self) {
    
    inline def setParameters(value: PathAttemptnumberOwnerQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonJobsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
