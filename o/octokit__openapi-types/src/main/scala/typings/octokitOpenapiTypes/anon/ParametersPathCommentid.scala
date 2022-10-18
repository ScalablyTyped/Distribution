package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentid extends StObject {
  
  var parameters: PathCommentid
  
  var responses: `20023`
}
object ParametersPathCommentid {
  
  inline def apply(parameters: PathCommentid, responses: `20023`): ParametersPathCommentid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentid]
  }
  
  extension [Self <: ParametersPathCommentid](x: Self) {
    
    inline def setParameters(value: PathCommentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20023`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
