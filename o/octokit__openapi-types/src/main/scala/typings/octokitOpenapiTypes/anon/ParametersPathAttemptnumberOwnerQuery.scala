package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberOwnerQuery extends StObject {
  
  var parameters: PathAttemptnumberOwnerQuery
  
  var responses: `200ContentApplicationjsonJobsTotalcount`
}
object ParametersPathAttemptnumberOwnerQuery {
  
  inline def apply(parameters: PathAttemptnumberOwnerQuery, responses: `200ContentApplicationjsonJobsTotalcount`): ParametersPathAttemptnumberOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAttemptnumberOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAttemptnumberOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonJobsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
