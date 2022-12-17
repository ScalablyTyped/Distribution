package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidNumberQuery407 extends StObject {
  
  var parameters: PathRunnergroupidNumberQuery407
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object ParametersPathRunnergroupidNumberQuery407 {
  
  inline def apply(
    parameters: PathRunnergroupidNumberQuery407,
    responses: `200ContentApplicationjsonRunnersTotalcount`
  ): ParametersPathRunnergroupidNumberQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidNumberQuery407]
  }
  
  extension [Self <: ParametersPathRunnergroupidNumberQuery407](x: Self) {
    
    inline def setParameters(value: PathRunnergroupidNumberQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
