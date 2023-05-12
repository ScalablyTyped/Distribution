package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses517 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `517`
}
object ParametersPathBranchOwnerResponses517 {
  
  inline def apply(parameters: PathBranchOwner, responses: `517`): ParametersPathBranchOwnerResponses517 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses517]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchOwnerResponses517] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `517`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
