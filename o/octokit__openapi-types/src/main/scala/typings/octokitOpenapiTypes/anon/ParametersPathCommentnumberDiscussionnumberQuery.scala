package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberQuery extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberQuery
  
  var responses: `200Content138`
}
object ParametersPathCommentnumberDiscussionnumberQuery {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberQuery, responses: `200Content138`): ParametersPathCommentnumberDiscussionnumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberDiscussionnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content138`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
