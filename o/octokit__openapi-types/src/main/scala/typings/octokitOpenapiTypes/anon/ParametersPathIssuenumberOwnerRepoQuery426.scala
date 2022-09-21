package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery426 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery426
  
  var responses: `200Content550`
}
object ParametersPathIssuenumberOwnerRepoQuery426 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery426, responses: `200Content550`): ParametersPathIssuenumberOwnerRepoQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery426]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoQuery426](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content550`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
