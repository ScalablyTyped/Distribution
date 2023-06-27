package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson193 extends StObject {
  
  var parameters: PathEnvironmentnameStringNameString
  
  var requestBody: ContentApplicationjson193
}
object ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson193 {
  
  inline def apply(parameters: PathEnvironmentnameStringNameString, requestBody: ContentApplicationjson193): ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson193 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson193]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameStringNameStringRequestBodyContentApplicationjson193] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameStringNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson193): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
