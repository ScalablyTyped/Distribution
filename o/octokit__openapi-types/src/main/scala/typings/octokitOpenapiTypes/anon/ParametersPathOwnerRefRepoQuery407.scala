package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefRepoQuery407 extends StObject {
  
  var parameters: PathOwnerRefRepoQuery407
  
  var responses: `200ContentApplicationjsonStatuses`
}
object ParametersPathOwnerRefRepoQuery407 {
  
  inline def apply(parameters: PathOwnerRefRepoQuery407, responses: `200ContentApplicationjsonStatuses`): ParametersPathOwnerRefRepoQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefRepoQuery407]
  }
  
  extension [Self <: ParametersPathOwnerRefRepoQuery407](x: Self) {
    
    inline def setParameters(value: PathOwnerRefRepoQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonStatuses`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
