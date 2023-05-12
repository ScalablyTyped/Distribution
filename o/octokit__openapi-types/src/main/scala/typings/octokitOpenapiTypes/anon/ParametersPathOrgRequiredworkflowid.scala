package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRequiredworkflowid extends StObject {
  
  var parameters: PathOrgRequiredworkflowid
  
  var responses: `200ContentApplicationjsonNamePath`
}
object ParametersPathOrgRequiredworkflowid {
  
  inline def apply(parameters: PathOrgRequiredworkflowid, responses: `200ContentApplicationjsonNamePath`): ParametersPathOrgRequiredworkflowid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNamePath`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
