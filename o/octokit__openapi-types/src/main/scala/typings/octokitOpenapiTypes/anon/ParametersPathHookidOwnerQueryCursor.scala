package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerQueryCursor extends StObject {
  
  var parameters: PathHookidOwnerQueryCursor
  
  var responses: `400`
}
object ParametersPathHookidOwnerQueryCursor {
  
  inline def apply(parameters: PathHookidOwnerQueryCursor, responses: `400`): ParametersPathHookidOwnerQueryCursor = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerQueryCursor]
  }
  
  extension [Self <: ParametersPathHookidOwnerQueryCursor](x: Self) {
    
    inline def setParameters(value: PathHookidOwnerQueryCursor): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
