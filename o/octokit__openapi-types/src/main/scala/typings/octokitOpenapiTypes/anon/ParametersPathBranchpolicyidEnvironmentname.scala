package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchpolicyidEnvironmentname extends StObject {
  
  var parameters: PathBranchpolicyidEnvironmentname
  
  var responses: `200ContentApplicationjsonNameNodeid`
}
object ParametersPathBranchpolicyidEnvironmentname {
  
  inline def apply(parameters: PathBranchpolicyidEnvironmentname, responses: `200ContentApplicationjsonNameNodeid`): ParametersPathBranchpolicyidEnvironmentname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchpolicyidEnvironmentname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchpolicyidEnvironmentname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyidEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNameNodeid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
