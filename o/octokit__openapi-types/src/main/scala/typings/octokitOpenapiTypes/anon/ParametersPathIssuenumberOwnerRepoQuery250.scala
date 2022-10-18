package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery250 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery250
  
  var responses: `200Content530`
}
object ParametersPathIssuenumberOwnerRepoQuery250 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery250, responses: `200Content530`): ParametersPathIssuenumberOwnerRepoQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery250]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoQuery250](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content530`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
