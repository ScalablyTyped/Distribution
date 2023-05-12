package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoWorkflowid extends StObject {
  
  var parameters: PathRepoWorkflowid
  
  var responses: `200ContentApplicationjsonBadgeurlCreatedat`
}
object ParametersPathRepoWorkflowid {
  
  inline def apply(parameters: PathRepoWorkflowid, responses: `200ContentApplicationjsonBadgeurlCreatedat`): ParametersPathRepoWorkflowid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoWorkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoWorkflowid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBadgeurlCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
