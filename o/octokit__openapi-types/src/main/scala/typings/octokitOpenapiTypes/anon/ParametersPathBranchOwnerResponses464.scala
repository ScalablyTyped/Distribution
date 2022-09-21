package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwnerResponses464 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `464`
}
object ParametersPathBranchOwnerResponses464 {
  
  inline def apply(parameters: PathBranchOwner, responses: `464`): ParametersPathBranchOwnerResponses464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwnerResponses464]
  }
  
  extension [Self <: ParametersPathBranchOwnerResponses464](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `464`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
