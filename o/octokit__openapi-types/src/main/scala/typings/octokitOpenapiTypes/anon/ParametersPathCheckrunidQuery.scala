package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidQuery extends StObject {
  
  var parameters: PathCheckrunidQuery
  
  var responses: `200Content219`
}
object ParametersPathCheckrunidQuery {
  
  inline def apply(parameters: PathCheckrunidQuery, responses: `200Content219`): ParametersPathCheckrunidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCheckrunidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content219`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
