package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoWorkflowidResponses extends StObject {
  
  var parameters: PathRepoWorkflowid
}
object ParametersPathRepoWorkflowidResponses {
  
  inline def apply(parameters: PathRepoWorkflowid): ParametersPathRepoWorkflowidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoWorkflowidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoWorkflowidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
