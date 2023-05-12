package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidGistidResponses304403Content36 extends StObject {
  
  var parameters: PathCommentidGistid
  
  var responses: `304403Content36`
}
object ParametersPathCommentidGistidResponses304403Content36 {
  
  inline def apply(parameters: PathCommentidGistid, responses: `304403Content36`): ParametersPathCommentidGistidResponses304403Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidGistidResponses304403Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidGistidResponses304403Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
