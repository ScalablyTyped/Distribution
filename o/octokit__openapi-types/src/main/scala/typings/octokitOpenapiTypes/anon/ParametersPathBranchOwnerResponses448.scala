package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses448 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `448`
}
object ParametersPathBranchOwnerResponses448 {
  
  inline def apply(parameters: PathBranchOwner, responses: `448`): ParametersPathBranchOwnerResponses448 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses448]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchOwnerResponses448] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `448`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
