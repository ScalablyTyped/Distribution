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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchpolicyidResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
