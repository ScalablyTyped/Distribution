package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerRepoResponses236 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var responses: `236`
}
object ParametersPathBranchOwnerRepoResponses236 {
  
  inline def apply(parameters: PathBranchOwnerRepo, responses: `236`): ParametersPathBranchOwnerRepoResponses236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerRepoResponses236]
  }
  
  extension [Self <: ParametersPathBranchOwnerRepoResponses236](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
