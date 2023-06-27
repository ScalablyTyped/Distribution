package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson193 extends StObject {
  
  var parameters: PathNameStringOwnerString
  
  var requestBody: ContentApplicationjson193
}
object ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson193 {
  
  inline def apply(parameters: PathNameStringOwnerString, requestBody: ContentApplicationjson193): ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson193 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson193]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOwnerStringRequestBodyContentApplicationjson193] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson193): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
