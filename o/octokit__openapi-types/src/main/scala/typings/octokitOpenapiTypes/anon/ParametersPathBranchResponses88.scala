package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchResponses88 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `88`
}
object ParametersPathBranchResponses88 {
  
  inline def apply(parameters: PathBranch, responses: `88`): ParametersPathBranchResponses88 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchResponses88]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchResponses88] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `88`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
