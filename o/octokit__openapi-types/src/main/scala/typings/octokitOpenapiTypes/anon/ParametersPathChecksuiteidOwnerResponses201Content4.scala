package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwnerResponses201Content4 extends StObject {
  
  var parameters: PathChecksuiteidOwner
  
  var responses: `201Content4`
}
object ParametersPathChecksuiteidOwnerResponses201Content4 {
  
  inline def apply(parameters: PathChecksuiteidOwner, responses: `201Content4`): ParametersPathChecksuiteidOwnerResponses201Content4 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwnerResponses201Content4]
  }
  
  extension [Self <: ParametersPathChecksuiteidOwnerResponses201Content4](x: Self) {
    
    inline def setParameters(value: PathChecksuiteidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
