package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberQuery extends StObject {
  
  var parameters: PathDiscussionnumberNumberQuery
  
  var responses: `200Content626`
}
object ParametersPathDiscussionnumberNumberQuery {
  
  inline def apply(parameters: PathDiscussionnumberNumberQuery, responses: `200Content626`): ParametersPathDiscussionnumberNumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content626`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
