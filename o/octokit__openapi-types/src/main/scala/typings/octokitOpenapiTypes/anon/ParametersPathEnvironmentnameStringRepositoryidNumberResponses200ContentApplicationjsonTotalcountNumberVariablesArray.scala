package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameStringRepositoryidNumberResponses200ContentApplicationjsonTotalcountNumberVariablesArray extends StObject {
  
  var parameters: PathEnvironmentnameStringRepositoryidNumber
  
  var responses: `200ContentApplicationjsonTotalcountNumberVariablesArray`
}
object ParametersPathEnvironmentnameStringRepositoryidNumberResponses200ContentApplicationjsonTotalcountNumberVariablesArray {
  
  inline def apply(
    parameters: PathEnvironmentnameStringRepositoryidNumber,
    responses: `200ContentApplicationjsonTotalcountNumberVariablesArray`
  ): ParametersPathEnvironmentnameStringRepositoryidNumberResponses200ContentApplicationjsonTotalcountNumberVariablesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameStringRepositoryidNumberResponses200ContentApplicationjsonTotalcountNumberVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameStringRepositoryidNumberResponses200ContentApplicationjsonTotalcountNumberVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameStringRepositoryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountNumberVariablesArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
