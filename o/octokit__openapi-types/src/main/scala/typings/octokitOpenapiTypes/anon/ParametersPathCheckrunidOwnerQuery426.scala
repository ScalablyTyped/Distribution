package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidOwnerQuery426 extends StObject {
  
  var parameters: PathCheckrunidOwnerQuery426
  
  var responses: `200Content512`
}
object ParametersPathCheckrunidOwnerQuery426 {
  
  inline def apply(parameters: PathCheckrunidOwnerQuery426, responses: `200Content512`): ParametersPathCheckrunidOwnerQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidOwnerQuery426]
  }
  
  extension [Self <: ParametersPathCheckrunidOwnerQuery426](x: Self) {
    
    inline def setParameters(value: PathCheckrunidOwnerQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content512`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
