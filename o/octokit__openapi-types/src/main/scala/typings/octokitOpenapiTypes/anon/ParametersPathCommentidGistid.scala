package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidGistid extends StObject {
  
  var parameters: PathCommentidGistid
  
  var responses: `200566`
}
object ParametersPathCommentidGistid {
  
  inline def apply(parameters: PathCommentidGistid, responses: `200566`): ParametersPathCommentidGistid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidGistid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidGistid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200566`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
