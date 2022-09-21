package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery481 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery481
  
  var responses: `200Content482404Content55410Content55`
}
object ParametersPathIssuenumberOwnerRepoQuery481 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery481, responses: `200Content482404Content55410Content55`): ParametersPathIssuenumberOwnerRepoQuery481 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery481]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoQuery481](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery481): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482404Content55410Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
