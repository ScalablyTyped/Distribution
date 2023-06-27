package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPatidNumberQuery extends StObject {
  
  var parameters: PathPatidNumberQuery
  
  var responses: `200403404500`
}
object ParametersPathPatidNumberQuery {
  
  inline def apply(parameters: PathPatidNumberQuery, responses: `200403404500`): ParametersPathPatidNumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPatidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPatidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPatidNumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
