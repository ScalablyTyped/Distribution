package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepoQuery532 extends StObject {
  
  var parameters: PathCommentidOwnerRepoQuery532
  
  var responses: `200Content533404Content36`
}
object ParametersPathCommentidOwnerRepoQuery532 {
  
  inline def apply(parameters: PathCommentidOwnerRepoQuery532, responses: `200Content533404Content36`): ParametersPathCommentidOwnerRepoQuery532 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepoQuery532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidOwnerRepoQuery532] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerRepoQuery532): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content533404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
