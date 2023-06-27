package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwnerQuery extends StObject {
  
  var parameters: PathChecksuiteidOwnerQuery
  
  var responses: `200ContentApplicationjsonCheckrunsTotalcount`
}
object ParametersPathChecksuiteidOwnerQuery {
  
  inline def apply(parameters: PathChecksuiteidOwnerQuery, responses: `200ContentApplicationjsonCheckrunsTotalcount`): ParametersPathChecksuiteidOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathChecksuiteidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathChecksuiteidOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckrunsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
