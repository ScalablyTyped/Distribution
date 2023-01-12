package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidResponses304403404 extends StObject {
  
  var parameters: PathCommentid
  
  var responses: `304403404`
}
object ParametersPathCommentidResponses304403404 {
  
  inline def apply(parameters: PathCommentid, responses: `304403404`): ParametersPathCommentidResponses304403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidResponses304403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidResponses304403404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
