package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerRepo extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var responses: `200Content437`
}
object ParametersPathBranchOwnerRepo {
  
  inline def apply(parameters: PathBranchOwnerRepo, responses: `200Content437`): ParametersPathBranchOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerRepo]
  }
  
  extension [Self <: ParametersPathBranchOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content437`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
