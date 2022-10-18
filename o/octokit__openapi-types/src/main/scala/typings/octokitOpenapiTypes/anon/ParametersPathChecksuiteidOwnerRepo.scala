package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwnerRepo extends StObject {
  
  var parameters: PathChecksuiteidOwnerRepo
  
  var responses: `450`
}
object ParametersPathChecksuiteidOwnerRepo {
  
  inline def apply(parameters: PathChecksuiteidOwnerRepo, responses: `450`): ParametersPathChecksuiteidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwnerRepo]
  }
  
  extension [Self <: ParametersPathChecksuiteidOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathChecksuiteidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `450`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
