package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses606 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `606`
}
object ParametersPathBranchOwnerResponses606 {
  
  inline def apply(parameters: PathBranchOwner, responses: `606`): ParametersPathBranchOwnerResponses606 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses606]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchOwnerResponses606] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `606`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
