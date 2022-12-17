package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchpolicyidEnvironmentname extends StObject {
  
  var parameters: PathBranchpolicyidEnvironmentname
  
  var responses: `513`
}
object ParametersPathBranchpolicyidEnvironmentname {
  
  inline def apply(parameters: PathBranchpolicyidEnvironmentname, responses: `513`): ParametersPathBranchpolicyidEnvironmentname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchpolicyidEnvironmentname]
  }
  
  extension [Self <: ParametersPathBranchpolicyidEnvironmentname](x: Self) {
    
    inline def setParameters(value: PathBranchpolicyidEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `513`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
