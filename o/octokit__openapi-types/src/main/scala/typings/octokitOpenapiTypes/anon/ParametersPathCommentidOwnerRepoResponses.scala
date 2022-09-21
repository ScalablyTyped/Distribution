package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepoResponses extends StObject {
  
  var parameters: PathCommentidOwnerRepo
}
object ParametersPathCommentidOwnerRepoResponses {
  
  inline def apply(parameters: PathCommentidOwnerRepo): ParametersPathCommentidOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepoResponses]
  }
  
  extension [Self <: ParametersPathCommentidOwnerRepoResponses](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
