package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoUsername extends StObject {
  
  var parameters: PathOwnerRepoUsername
}
object ParametersPathOwnerRepoUsername {
  
  inline def apply(parameters: PathOwnerRepoUsername): ParametersPathOwnerRepoUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
