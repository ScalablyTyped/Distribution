package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwnerRepoResponses201Content4 extends StObject {
  
  var parameters: PathChecksuiteidOwnerRepo
  
  var responses: `201Content4`
}
object ParametersPathChecksuiteidOwnerRepoResponses201Content4 {
  
  inline def apply(parameters: PathChecksuiteidOwnerRepo, responses: `201Content4`): ParametersPathChecksuiteidOwnerRepoResponses201Content4 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwnerRepoResponses201Content4]
  }
  
  extension [Self <: ParametersPathChecksuiteidOwnerRepoResponses201Content4](x: Self) {
    
    inline def setParameters(value: PathChecksuiteidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
