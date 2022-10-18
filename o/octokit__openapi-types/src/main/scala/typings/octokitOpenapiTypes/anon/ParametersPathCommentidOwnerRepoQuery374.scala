package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepoQuery374 extends StObject {
  
  var parameters: PathCommentidOwnerRepoQuery374
  
  var responses: `200Content375404`
}
object ParametersPathCommentidOwnerRepoQuery374 {
  
  inline def apply(parameters: PathCommentidOwnerRepoQuery374, responses: `200Content375404`): ParametersPathCommentidOwnerRepoQuery374 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepoQuery374]
  }
  
  extension [Self <: ParametersPathCommentidOwnerRepoQuery374](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepoQuery374): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content375404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
