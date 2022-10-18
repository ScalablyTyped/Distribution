package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerResponses404Content6 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `404Content6`
}
object ParametersPathCommentidOwnerResponses404Content6 {
  
  inline def apply(parameters: PathCommentidOwner, responses: `404Content6`): ParametersPathCommentidOwnerResponses404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerResponses404Content6]
  }
  
  extension [Self <: ParametersPathCommentidOwnerResponses404Content6](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
