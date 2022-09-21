package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerResponses extends StObject {
  
  var parameters: PathCommentidOwner
}
object ParametersPathCommentidOwnerResponses {
  
  inline def apply(parameters: PathCommentidOwner): ParametersPathCommentidOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerResponses]
  }
  
  extension [Self <: ParametersPathCommentidOwnerResponses](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
