package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageRole extends StObject {
  
  var parameters: QueryPagePerpageRole
  
  var responses: `200Content454Headers`
}
object ParametersQueryPagePerpageRole {
  
  inline def apply(parameters: QueryPagePerpageRole, responses: `200Content454Headers`): ParametersQueryPagePerpageRole = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageRole]
  }
  
  extension [Self <: ParametersQueryPagePerpageRole](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageRole): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content454Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
