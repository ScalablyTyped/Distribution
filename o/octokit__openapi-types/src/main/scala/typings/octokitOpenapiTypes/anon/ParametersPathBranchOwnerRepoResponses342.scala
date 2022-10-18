package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerRepoResponses342 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var responses: `342`
}
object ParametersPathBranchOwnerRepoResponses342 {
  
  inline def apply(parameters: PathBranchOwnerRepo, responses: `342`): ParametersPathBranchOwnerRepoResponses342 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerRepoResponses342]
  }
  
  extension [Self <: ParametersPathBranchOwnerRepoResponses342](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `342`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
