package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepoQuery464 extends StObject {
  
  var parameters: PathCommentidOwnerRepoQuery464
  
  var responses: `200Content465404Content48`
}
object ParametersPathCommentidOwnerRepoQuery464 {
  
  inline def apply(parameters: PathCommentidOwnerRepoQuery464, responses: `200Content465404Content48`): ParametersPathCommentidOwnerRepoQuery464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepoQuery464]
  }
  
  extension [Self <: ParametersPathCommentidOwnerRepoQuery464](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepoQuery464): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content465404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
