package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses70 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `70`
}
object ParametersPathOwnerRepoResponses70 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `70`): ParametersPathOwnerRepoResponses70 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses70]
  }
  
  extension [Self <: ParametersPathOwnerRepoResponses70](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `70`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
