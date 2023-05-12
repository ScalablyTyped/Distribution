package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameRepositoryidQuery68 extends StObject {
  
  var parameters: PathEnvironmentnameRepositoryidQuery68
  
  var responses: `200ContentApplicationjsonTotalcountVariables`
}
object ParametersPathEnvironmentnameRepositoryidQuery68 {
  
  inline def apply(
    parameters: PathEnvironmentnameRepositoryidQuery68,
    responses: `200ContentApplicationjsonTotalcountVariables`
  ): ParametersPathEnvironmentnameRepositoryidQuery68 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameRepositoryidQuery68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameRepositoryidQuery68] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameRepositoryidQuery68): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountVariables`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
