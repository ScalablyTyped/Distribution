package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses200Content18 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `200Content18`
}
object ParametersPathOwnerRepoResponses200Content18 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `200Content18`): ParametersPathOwnerRepoResponses200Content18 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses200Content18]
  }
  
  extension [Self <: ParametersPathOwnerRepoResponses200Content18](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content18`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
