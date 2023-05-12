package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson165 extends StObject {
  
  var parameters: PathEnvironmentnameStringNameString
  
  var requestBody: ContentApplicationjson165
}
object ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson165 {
  
  inline def apply(parameters: PathEnvironmentnameStringNameString, requestBody: ContentApplicationjson165): ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson165 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson165]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson165] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameStringNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson165): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
