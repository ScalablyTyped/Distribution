package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepoQuery481 extends StObject {
  
  var parameters: PathCommentidOwnerRepoQuery481
  
  var responses: `200Content482404Content55`
}
object ParametersPathCommentidOwnerRepoQuery481 {
  
  inline def apply(parameters: PathCommentidOwnerRepoQuery481, responses: `200Content482404Content55`): ParametersPathCommentidOwnerRepoQuery481 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepoQuery481]
  }
  
  extension [Self <: ParametersPathCommentidOwnerRepoQuery481](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepoQuery481): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
