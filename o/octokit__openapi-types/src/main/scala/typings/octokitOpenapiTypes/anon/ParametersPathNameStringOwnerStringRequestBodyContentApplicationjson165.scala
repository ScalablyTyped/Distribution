package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson165 extends StObject {
  
  var parameters: PathNameStringOwnerString
  
  var requestBody: ContentApplicationjson165
}
object ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson165 {
  
  inline def apply(parameters: PathNameStringOwnerString, requestBody: ContentApplicationjson165): ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson165 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson165]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson165] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson165): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
