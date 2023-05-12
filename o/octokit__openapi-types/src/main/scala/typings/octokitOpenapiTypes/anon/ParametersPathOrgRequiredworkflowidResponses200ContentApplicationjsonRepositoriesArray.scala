package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRequiredworkflowidResponses200ContentApplicationjsonRepositoriesArray extends StObject {
  
  var parameters: PathOrgRequiredworkflowid
  
  var responses: `200ContentApplicationjsonRepositoriesArray`
}
object ParametersPathOrgRequiredworkflowidResponses200ContentApplicationjsonRepositoriesArray {
  
  inline def apply(parameters: PathOrgRequiredworkflowid, responses: `200ContentApplicationjsonRepositoriesArray`): ParametersPathOrgRequiredworkflowidResponses200ContentApplicationjsonRepositoriesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRequiredworkflowidResponses200ContentApplicationjsonRepositoriesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRequiredworkflowidResponses200ContentApplicationjsonRepositoriesArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
