package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeQueryPerpageState extends StObject {
  
  var parameters: PathPackagenamePackagetypeQueryPerpageState
  
  var responses: `200401403404`
}
object ParametersPathPackagenamePackagetypeQueryPerpageState {
  
  inline def apply(parameters: PathPackagenamePackagetypeQueryPerpageState, responses: `200401403404`): ParametersPathPackagenamePackagetypeQueryPerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeQueryPerpageState]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetypeQueryPerpageState](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypeQueryPerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
