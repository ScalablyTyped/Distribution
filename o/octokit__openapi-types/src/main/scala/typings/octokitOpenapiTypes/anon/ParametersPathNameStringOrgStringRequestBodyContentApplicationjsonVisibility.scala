package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonVisibility extends StObject {
  
  var parameters: PathNameStringOrgString
  
  var requestBody: ContentApplicationjsonVisibility
}
object ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonVisibility {
  
  inline def apply(parameters: PathNameStringOrgString, requestBody: ContentApplicationjsonVisibility): ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOrgStringRequestBodyContentApplicationjsonVisibility] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonVisibility): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
