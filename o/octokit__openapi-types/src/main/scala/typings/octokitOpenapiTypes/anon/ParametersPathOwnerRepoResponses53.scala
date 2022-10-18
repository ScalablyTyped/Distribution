package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses53 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `53`
}
object ParametersPathOwnerRepoResponses53 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `53`): ParametersPathOwnerRepoResponses53 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses53]
  }
  
  extension [Self <: ParametersPathOwnerRepoResponses53](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `53`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
