package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids extends StObject {
  
  var parameters: PathRunnergroupid
  
  var requestBody: ContentApplicationjsonSelectedorganizationids
}
object ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids {
  
  inline def apply(parameters: PathRunnergroupid, requestBody: ContentApplicationjsonSelectedorganizationids): ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids]
  }
  
  extension [Self <: ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids](x: Self) {
    
    inline def setParameters(value: PathRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
