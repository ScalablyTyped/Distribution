package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses extends StObject {
  
  var parameters: PathBranchOwner
}
object ParametersPathBranchOwnerResponses {
  
  inline def apply(parameters: PathBranchOwner): ParametersPathBranchOwnerResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses]
  }
  
  extension [Self <: ParametersPathBranchOwnerResponses](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
