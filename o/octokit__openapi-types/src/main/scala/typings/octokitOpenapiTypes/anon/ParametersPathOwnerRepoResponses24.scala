package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses24 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `24`
}
object ParametersPathOwnerRepoResponses24 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `24`): ParametersPathOwnerRepoResponses24 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses24]
  }
  
  extension [Self <: ParametersPathOwnerRepoResponses24](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `24`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
