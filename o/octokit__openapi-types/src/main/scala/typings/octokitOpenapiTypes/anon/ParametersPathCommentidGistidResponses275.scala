package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidGistidResponses275 extends StObject {
  
  var parameters: PathCommentidGistid
  
  var responses: `275`
}
object ParametersPathCommentidGistidResponses275 {
  
  inline def apply(parameters: PathCommentidGistid, responses: `275`): ParametersPathCommentidGistidResponses275 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidGistidResponses275]
  }
  
  extension [Self <: ParametersPathCommentidGistidResponses275](x: Self) {
    
    inline def setParameters(value: PathCommentidGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `275`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
