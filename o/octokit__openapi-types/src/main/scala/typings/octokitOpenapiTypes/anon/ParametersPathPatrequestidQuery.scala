package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPatrequestidQuery extends StObject {
  
  var parameters: PathPatrequestidQuery
  
  var responses: `404500`
}
object ParametersPathPatrequestidQuery {
  
  inline def apply(parameters: PathPatrequestidQuery, responses: `404500`): ParametersPathPatrequestidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPatrequestidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPatrequestidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPatrequestidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
