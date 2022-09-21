package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSecretnameResponses extends StObject {
  
  var parameters: PathOwnerRepoSecretname
}
object ParametersPathOwnerRepoSecretnameResponses {
  
  inline def apply(parameters: PathOwnerRepoSecretname): ParametersPathOwnerRepoSecretnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSecretnameResponses]
  }
  
  extension [Self <: ParametersPathOwnerRepoSecretnameResponses](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
