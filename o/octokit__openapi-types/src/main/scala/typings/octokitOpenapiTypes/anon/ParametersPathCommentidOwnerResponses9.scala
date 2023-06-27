package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerResponses9 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `9`
}
object ParametersPathCommentidOwnerResponses9 {
  
  inline def apply(parameters: PathCommentidOwner, responses: `9`): ParametersPathCommentidOwnerResponses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidOwnerResponses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
