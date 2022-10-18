package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepoResponses236 extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var responses: `236`
}
object ParametersPathCommentidOwnerRepoResponses236 {
  
  inline def apply(parameters: PathCommentidOwnerRepo, responses: `236`): ParametersPathCommentidOwnerRepoResponses236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepoResponses236]
  }
  
  extension [Self <: ParametersPathCommentidOwnerRepoResponses236](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
