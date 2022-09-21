package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoUsernameResponses extends StObject {
  
  var parameters: PathOwnerRepoUsername
}
object ParametersPathOwnerRepoUsernameResponses {
  
  inline def apply(parameters: PathOwnerRepoUsername): ParametersPathOwnerRepoUsernameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoUsernameResponses]
  }
  
  extension [Self <: ParametersPathOwnerRepoUsernameResponses](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
