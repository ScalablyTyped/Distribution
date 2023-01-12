package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoQueryCursorPerpage extends StObject {
  
  var parameters: PathHookidOwnerRepoQueryCursorPerpage
  
  var responses: `400422`
}
object ParametersPathHookidOwnerRepoQueryCursorPerpage {
  
  inline def apply(parameters: PathHookidOwnerRepoQueryCursorPerpage, responses: `400422`): ParametersPathHookidOwnerRepoQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoQueryCursorPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerRepoQueryCursorPerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepoQueryCursorPerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
