package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs extends StObject {
  
  var parameters: PathRepoWorkflowid
  
  var requestBody: ContentApplicationjsonInputs
}
object ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs {
  
  inline def apply(parameters: PathRepoWorkflowid, requestBody: ContentApplicationjsonInputs): ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs]
  }
  
  extension [Self <: ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs](x: Self) {
    
    inline def setParameters(value: PathRepoWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonInputs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
