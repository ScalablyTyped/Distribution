package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery374 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery374
  
  var responses: `200Content375404410`
}
object ParametersPathIssuenumberOwnerRepoQuery374 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery374, responses: `200Content375404410`): ParametersPathIssuenumberOwnerRepoQuery374 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery374]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoQuery374](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery374): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content375404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
