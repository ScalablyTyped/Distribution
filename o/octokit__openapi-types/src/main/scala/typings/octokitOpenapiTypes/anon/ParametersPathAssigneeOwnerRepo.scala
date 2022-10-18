package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssigneeOwnerRepo extends StObject {
  
  var parameters: PathAssigneeOwnerRepo
  
  var responses: `404Content6`
}
object ParametersPathAssigneeOwnerRepo {
  
  inline def apply(parameters: PathAssigneeOwnerRepo, responses: `404Content6`): ParametersPathAssigneeOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssigneeOwnerRepo]
  }
  
  extension [Self <: ParametersPathAssigneeOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathAssigneeOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
