package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchResponses84 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `84`
}
object ParametersPathBranchResponses84 {
  
  inline def apply(parameters: PathBranch, responses: `84`): ParametersPathBranchResponses84 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchResponses84]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchResponses84] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `84`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
