package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathWorkflowid extends StObject {
  
  var parameters: PathWorkflowid
  
  var responses: `200ContentApplicationjsonBadgeurl`
}
object ParametersPathWorkflowid {
  
  inline def apply(parameters: PathWorkflowid, responses: `200ContentApplicationjsonBadgeurl`): ParametersPathWorkflowid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathWorkflowid]
  }
  
  extension [Self <: ParametersPathWorkflowid](x: Self) {
    
    inline def setParameters(value: PathWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBadgeurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
