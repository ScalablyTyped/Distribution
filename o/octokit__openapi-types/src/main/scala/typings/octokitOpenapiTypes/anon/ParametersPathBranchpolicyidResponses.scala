package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchpolicyidResponses extends StObject {
  
  var parameters: PathBranchpolicyid
}
object ParametersPathBranchpolicyidResponses {
  
  inline def apply(parameters: PathBranchpolicyid): ParametersPathBranchpolicyidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchpolicyidResponses]
  }
  
  extension [Self <: ParametersPathBranchpolicyidResponses](x: Self) {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
