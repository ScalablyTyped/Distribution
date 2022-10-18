package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSecretname extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var responses: `200Content429`
}
object ParametersPathOwnerRepoSecretname {
  
  inline def apply(parameters: PathOwnerRepoSecretname, responses: `200Content429`): ParametersPathOwnerRepoSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSecretname]
  }
  
  extension [Self <: ParametersPathOwnerRepoSecretname](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content429`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
