package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidRequiredworkflowid extends StObject {
  
  var parameters: PathRepositoryidRequiredworkflowid
}
object ParametersPathRepositoryidRequiredworkflowid {
  
  inline def apply(parameters: PathRepositoryidRequiredworkflowid): ParametersPathRepositoryidRequiredworkflowid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepositoryidRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
