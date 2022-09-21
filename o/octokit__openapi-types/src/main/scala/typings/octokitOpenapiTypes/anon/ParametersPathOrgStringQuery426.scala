package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQuery426 extends StObject {
  
  var parameters: PathOrgStringQuery426
  
  var responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`
}
object ParametersPathOrgStringQuery426 {
  
  inline def apply(
    parameters: PathOrgStringQuery426,
    responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`
  ): ParametersPathOrgStringQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQuery426]
  }
  
  extension [Self <: ParametersPathOrgStringQuery426](x: Self) {
    
    inline def setParameters(value: PathOrgStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositorycacheusagesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
