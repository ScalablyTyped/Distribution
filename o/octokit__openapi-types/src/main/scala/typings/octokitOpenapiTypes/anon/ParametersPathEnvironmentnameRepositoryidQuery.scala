package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameRepositoryidQuery extends StObject {
  
  var parameters: PathEnvironmentnameRepositoryidQuery
  
  var responses: `200ContentApplicationjsonTotalcountVariables`
}
object ParametersPathEnvironmentnameRepositoryidQuery {
  
  inline def apply(
    parameters: PathEnvironmentnameRepositoryidQuery,
    responses: `200ContentApplicationjsonTotalcountVariables`
  ): ParametersPathEnvironmentnameRepositoryidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameRepositoryidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameRepositoryidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameRepositoryidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountVariables`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
