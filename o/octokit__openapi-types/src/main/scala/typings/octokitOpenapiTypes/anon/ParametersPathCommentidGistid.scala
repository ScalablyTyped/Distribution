package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidGistid extends StObject {
  
  var parameters: PathCommentidGistid
  
  var responses: `200421`
}
object ParametersPathCommentidGistid {
  
  inline def apply(parameters: PathCommentidGistid, responses: `200421`): ParametersPathCommentidGistid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidGistid]
  }
  
  extension [Self <: ParametersPathCommentidGistid](x: Self) {
    
    inline def setParameters(value: PathCommentidGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
