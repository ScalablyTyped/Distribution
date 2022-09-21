package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses404Content55 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `404Content55`
}
object ParametersPathBranchOwnerResponses404Content55 {
  
  inline def apply(parameters: PathBranchOwner, responses: `404Content55`): ParametersPathBranchOwnerResponses404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses404Content55]
  }
  
  extension [Self <: ParametersPathBranchOwnerResponses404Content55](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
