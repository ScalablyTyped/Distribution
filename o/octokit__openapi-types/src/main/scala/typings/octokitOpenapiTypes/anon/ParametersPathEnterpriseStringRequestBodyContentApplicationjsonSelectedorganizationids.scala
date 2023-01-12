package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseStringRequestBodyContentApplicationjsonSelectedorganizationids extends StObject {
  
  var parameters: PathEnterpriseString
  
  var requestBody: ContentApplicationjsonSelectedorganizationids
}
object ParametersPathEnterpriseStringRequestBodyContentApplicationjsonSelectedorganizationids {
  
  inline def apply(parameters: PathEnterpriseString, requestBody: ContentApplicationjsonSelectedorganizationids): ParametersPathEnterpriseStringRequestBodyContentApplicationjsonSelectedorganizationids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseStringRequestBodyContentApplicationjsonSelectedorganizationids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseStringRequestBodyContentApplicationjsonSelectedorganizationids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
