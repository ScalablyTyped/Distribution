package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoUsername extends StObject {
  
  var parameters: PathRepoUsername
}
object ParametersPathRepoUsername {
  
  inline def apply(parameters: PathRepoUsername): ParametersPathRepoUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
