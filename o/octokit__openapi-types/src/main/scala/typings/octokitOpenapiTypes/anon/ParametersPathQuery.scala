package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathQuery extends StObject {
  
  var parameters: PathQuery
  
  var responses: `304403`
}
object ParametersPathQuery {
  
  inline def apply(parameters: PathQuery, responses: `304403`): ParametersPathQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
