package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerQuery426 extends StObject {
  
  var parameters: PathEnvironmentnameOwnerQuery426
  
  var responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
}
object ParametersPathEnvironmentnameOwnerQuery426 {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerQuery426,
    responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
  ): ParametersPathEnvironmentnameOwnerQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerQuery426]
  }
  
  extension [Self <: ParametersPathEnvironmentnameOwnerQuery426](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwnerQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBranchpoliciesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
