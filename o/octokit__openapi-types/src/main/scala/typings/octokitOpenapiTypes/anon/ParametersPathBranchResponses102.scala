package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchResponses102 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `102`
}
object ParametersPathBranchResponses102 {
  
  inline def apply(parameters: PathBranch, responses: `102`): ParametersPathBranchResponses102 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchResponses102]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchResponses102] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `102`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
