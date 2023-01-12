package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchpolicyidEnvironmentnameResponses extends StObject {
  
  var parameters: PathBranchpolicyidEnvironmentname
}
object ParametersPathBranchpolicyidEnvironmentnameResponses {
  
  inline def apply(parameters: PathBranchpolicyidEnvironmentname): ParametersPathBranchpolicyidEnvironmentnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchpolicyidEnvironmentnameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchpolicyidEnvironmentnameResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyidEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
