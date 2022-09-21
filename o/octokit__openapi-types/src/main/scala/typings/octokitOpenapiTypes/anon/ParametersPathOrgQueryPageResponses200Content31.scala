package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgQueryPageResponses200Content31 extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `200Content31`
}
object ParametersPathOrgQueryPageResponses200Content31 {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `200Content31`): ParametersPathOrgQueryPageResponses200Content31 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgQueryPageResponses200Content31]
  }
  
  extension [Self <: ParametersPathOrgQueryPageResponses200Content31](x: Self) {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content31`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
