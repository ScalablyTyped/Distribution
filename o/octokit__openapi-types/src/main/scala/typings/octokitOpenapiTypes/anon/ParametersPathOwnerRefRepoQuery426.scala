package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefRepoQuery426 extends StObject {
  
  var parameters: PathOwnerRefRepoQuery426
  
  var responses: `200ContentApplicationjsonStatuses`
}
object ParametersPathOwnerRefRepoQuery426 {
  
  inline def apply(parameters: PathOwnerRefRepoQuery426, responses: `200ContentApplicationjsonStatuses`): ParametersPathOwnerRefRepoQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefRepoQuery426]
  }
  
  extension [Self <: ParametersPathOwnerRefRepoQuery426](x: Self) {
    
    inline def setParameters(value: PathOwnerRefRepoQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonStatuses`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
