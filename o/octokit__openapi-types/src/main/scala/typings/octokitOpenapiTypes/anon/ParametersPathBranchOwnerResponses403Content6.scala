package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses403Content6 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `403Content6`
}
object ParametersPathBranchOwnerResponses403Content6 {
  
  inline def apply(parameters: PathBranchOwner, responses: `403Content6`): ParametersPathBranchOwnerResponses403Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses403Content6]
  }
  
  extension [Self <: ParametersPathBranchOwnerResponses403Content6](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
