package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerRepo extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var responses: `200Content467`
}
object ParametersPathCommentidOwnerRepo {
  
  inline def apply(parameters: PathCommentidOwnerRepo, responses: `200Content467`): ParametersPathCommentidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerRepo]
  }
  
  extension [Self <: ParametersPathCommentidOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content467`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
