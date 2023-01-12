package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids extends StObject {
  
  var parameters: PathEnterpriseRunnergroupid
  
  var requestBody: ContentApplicationjsonSelectedorganizationids
}
object ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupid,
    requestBody: ContentApplicationjsonSelectedorganizationids
  ): ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
