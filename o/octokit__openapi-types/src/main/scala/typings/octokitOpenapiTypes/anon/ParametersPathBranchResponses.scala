package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchResponses extends StObject {
  
  var parameters: PathBranch
}
object ParametersPathBranchResponses {
  
  inline def apply(parameters: PathBranch): ParametersPathBranchResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchResponses]
  }
  
  extension [Self <: ParametersPathBranchResponses](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
