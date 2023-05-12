package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoResponses extends StObject {
  
  var parameters: PathPullnumberRepo
}
object ParametersPathPullnumberRepoResponses {
  
  inline def apply(parameters: PathPullnumberRepo): ParametersPathPullnumberRepoResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberRepoResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
