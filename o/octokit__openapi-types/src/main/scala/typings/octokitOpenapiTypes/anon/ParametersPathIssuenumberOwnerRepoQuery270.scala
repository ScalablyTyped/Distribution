package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery270 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery270
  
  var responses: `200Content525404`
}
object ParametersPathIssuenumberOwnerRepoQuery270 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery270, responses: `200Content525404`): ParametersPathIssuenumberOwnerRepoQuery270 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery270]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoQuery270](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery270): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content525404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
