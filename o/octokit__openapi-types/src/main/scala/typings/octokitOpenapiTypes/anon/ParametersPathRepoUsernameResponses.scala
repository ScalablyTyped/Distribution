package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoUsernameResponses extends StObject {
  
  var parameters: PathRepoUsername
}
object ParametersPathRepoUsernameResponses {
  
  inline def apply(parameters: PathRepoUsername): ParametersPathRepoUsernameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoUsernameResponses]
  }
  
  extension [Self <: ParametersPathRepoUsernameResponses](x: Self) {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
