package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoResponses66 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `66`
}
object ParametersPathOwnerRepoResponses66 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `66`): ParametersPathOwnerRepoResponses66 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoResponses66]
  }
  
  extension [Self <: ParametersPathOwnerRepoResponses66](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `66`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
