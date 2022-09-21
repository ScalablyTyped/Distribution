package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchResponses92 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `92`
}
object ParametersPathBranchResponses92 {
  
  inline def apply(parameters: PathBranch, responses: `92`): ParametersPathBranchResponses92 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchResponses92]
  }
  
  extension [Self <: ParametersPathBranchResponses92](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `92`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
