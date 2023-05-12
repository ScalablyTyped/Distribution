package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameStringRepositoryidNumber extends StObject {
  
  var parameters: PathEnvironmentnameStringRepositoryidNumber
  
  var responses: `200ContentApplicationjson542`
}
object ParametersPathEnvironmentnameStringRepositoryidNumber {
  
  inline def apply(parameters: PathEnvironmentnameStringRepositoryidNumber, responses: `200ContentApplicationjson542`): ParametersPathEnvironmentnameStringRepositoryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameStringRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameStringRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameStringRepositoryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson542`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
