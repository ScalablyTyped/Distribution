package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProtectionruleidRepo extends StObject {
  
  var parameters: PathProtectionruleidRepo
  
  var responses: `200ContentApplicationjsonEnabledId`
}
object ParametersPathProtectionruleidRepo {
  
  inline def apply(parameters: PathProtectionruleidRepo, responses: `200ContentApplicationjsonEnabledId`): ParametersPathProtectionruleidRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProtectionruleidRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProtectionruleidRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProtectionruleidRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEnabledId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
