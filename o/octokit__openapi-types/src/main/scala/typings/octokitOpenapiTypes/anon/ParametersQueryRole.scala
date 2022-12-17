package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryRole extends StObject {
  
  var parameters: QueryRole
  
  var responses: `200Content69Headers`
}
object ParametersQueryRole {
  
  inline def apply(parameters: QueryRole, responses: `200Content69Headers`): ParametersQueryRole = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryRole]
  }
  
  extension [Self <: ParametersQueryRole](x: Self) {
    
    inline def setParameters(value: QueryRole): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content69Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
