package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepoQuery extends StObject {
  
  var parameters: PathCommentidOwnerRepoQuery
  
  var responses: `200Content628404Content41`
}
object ParametersPathCommentidOwnerRepoQuery {
  
  inline def apply(parameters: PathCommentidOwnerRepoQuery, responses: `200Content628404Content41`): ParametersPathCommentidOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerRepoQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content628404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
