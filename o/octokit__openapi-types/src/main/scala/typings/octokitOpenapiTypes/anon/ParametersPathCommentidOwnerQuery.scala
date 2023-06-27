package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerQuery extends StObject {
  
  var parameters: PathCommentidOwnerQuery
  
  var responses: `200Content138404`
}
object ParametersPathCommentidOwnerQuery {
  
  inline def apply(parameters: PathCommentidOwnerQuery, responses: `200Content138404`): ParametersPathCommentidOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content138404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
