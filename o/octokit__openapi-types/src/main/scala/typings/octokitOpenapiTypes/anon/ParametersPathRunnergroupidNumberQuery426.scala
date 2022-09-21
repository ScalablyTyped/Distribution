package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidNumberQuery426 extends StObject {
  
  var parameters: PathRunnergroupidNumberQuery426
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object ParametersPathRunnergroupidNumberQuery426 {
  
  inline def apply(
    parameters: PathRunnergroupidNumberQuery426,
    responses: `200ContentApplicationjsonRunnersTotalcount`
  ): ParametersPathRunnergroupidNumberQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidNumberQuery426]
  }
  
  extension [Self <: ParametersPathRunnergroupidNumberQuery426](x: Self) {
    
    inline def setParameters(value: PathRunnergroupidNumberQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
