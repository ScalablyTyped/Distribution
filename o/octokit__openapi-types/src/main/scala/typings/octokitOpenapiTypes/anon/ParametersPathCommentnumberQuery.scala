package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberQuery extends StObject {
  
  var parameters: PathCommentnumberQuery
  
  var responses: `200Content138`
}
object ParametersPathCommentnumberQuery {
  
  inline def apply(parameters: PathCommentnumberQuery, responses: `200Content138`): ParametersPathCommentnumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content138`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
