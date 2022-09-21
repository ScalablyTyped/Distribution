package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQueryPagePerpageSince extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQueryPagePerpageSince
  
  var responses: `200Content547404Content55`
}
object ParametersPathIssuenumberOwnerRepoQueryPagePerpageSince {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQueryPagePerpageSince, responses: `200Content547404Content55`): ParametersPathIssuenumberOwnerRepoQueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQueryPagePerpageSince]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoQueryPagePerpageSince](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQueryPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content547404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
