package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidQuery extends StObject {
  
  var parameters: PathGistidQuery
  
  var responses: `200304403404`
}
object ParametersPathGistidQuery {
  
  inline def apply(parameters: PathGistidQuery, responses: `200304403404`): ParametersPathGistidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGistidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
