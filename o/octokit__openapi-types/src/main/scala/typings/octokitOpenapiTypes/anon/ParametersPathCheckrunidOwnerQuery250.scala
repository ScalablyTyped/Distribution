package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidOwnerQuery250 extends StObject {
  
  var parameters: PathCheckrunidOwnerQuery250
  
  var responses: `200Content447`
}
object ParametersPathCheckrunidOwnerQuery250 {
  
  inline def apply(parameters: PathCheckrunidOwnerQuery250, responses: `200Content447`): ParametersPathCheckrunidOwnerQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidOwnerQuery250]
  }
  
  extension [Self <: ParametersPathCheckrunidOwnerQuery250](x: Self) {
    
    inline def setParameters(value: PathCheckrunidOwnerQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content447`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
