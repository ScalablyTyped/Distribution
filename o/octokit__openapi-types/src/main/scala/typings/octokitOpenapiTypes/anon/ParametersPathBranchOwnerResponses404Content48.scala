package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses404Content48 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `404Content48`
}
object ParametersPathBranchOwnerResponses404Content48 {
  
  inline def apply(parameters: PathBranchOwner, responses: `404Content48`): ParametersPathBranchOwnerResponses404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses404Content48]
  }
  
  extension [Self <: ParametersPathBranchOwnerResponses404Content48](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
