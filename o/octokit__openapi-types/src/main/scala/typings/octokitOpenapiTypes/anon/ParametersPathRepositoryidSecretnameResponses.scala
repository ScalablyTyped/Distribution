package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidSecretnameResponses extends StObject {
  
  var parameters: PathRepositoryidSecretname
}
object ParametersPathRepositoryidSecretnameResponses {
  
  inline def apply(parameters: PathRepositoryidSecretname): ParametersPathRepositoryidSecretnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidSecretnameResponses]
  }
  
  extension [Self <: ParametersPathRepositoryidSecretnameResponses](x: Self) {
    
    inline def setParameters(value: PathRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
