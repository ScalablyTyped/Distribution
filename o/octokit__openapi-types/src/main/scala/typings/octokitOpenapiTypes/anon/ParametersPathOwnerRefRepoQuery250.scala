package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefRepoQuery250 extends StObject {
  
  var parameters: PathOwnerRefRepoQuery250
  
  var responses: `200Content472`
}
object ParametersPathOwnerRefRepoQuery250 {
  
  inline def apply(parameters: PathOwnerRefRepoQuery250, responses: `200Content472`): ParametersPathOwnerRefRepoQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefRepoQuery250]
  }
  
  extension [Self <: ParametersPathOwnerRefRepoQuery250](x: Self) {
    
    inline def setParameters(value: PathOwnerRefRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content472`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
