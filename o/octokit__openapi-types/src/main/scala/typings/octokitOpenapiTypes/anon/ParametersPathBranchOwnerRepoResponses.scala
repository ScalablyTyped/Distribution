package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerRepoResponses extends StObject {
  
  var parameters: PathBranchOwnerRepo
}
object ParametersPathBranchOwnerRepoResponses {
  
  inline def apply(parameters: PathBranchOwnerRepo): ParametersPathBranchOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerRepoResponses]
  }
  
  extension [Self <: ParametersPathBranchOwnerRepoResponses](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
