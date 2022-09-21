package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwner extends StObject {
  
  var parameters: PathCommentidOwner
  
  var responses: `200Content210`
}
object ParametersPathCommentidOwner {
  
  inline def apply(parameters: PathCommentidOwner, responses: `200Content210`): ParametersPathCommentidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwner]
  }
  
  extension [Self <: ParametersPathCommentidOwner](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content210`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
