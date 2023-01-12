package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSecretnameResponses extends StObject {
  
  var parameters: PathRepoSecretname
}
object ParametersPathRepoSecretnameResponses {
  
  inline def apply(parameters: PathRepoSecretname): ParametersPathRepoSecretnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSecretnameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoSecretnameResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
