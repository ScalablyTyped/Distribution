package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberQuery extends StObject {
  
  var parameters: PathAlertnumberQuery
  
  var responses: `200Content226`
}
object ParametersPathAlertnumberQuery {
  
  inline def apply(parameters: PathAlertnumberQuery, responses: `200Content226`): ParametersPathAlertnumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAlertnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content226`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
