package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchpolicyid extends StObject {
  
  var parameters: PathBranchpolicyid
  
  var responses: `228`
}
object ParametersPathBranchpolicyid {
  
  inline def apply(parameters: PathBranchpolicyid, responses: `228`): ParametersPathBranchpolicyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchpolicyid]
  }
  
  extension [Self <: ParametersPathBranchpolicyid](x: Self) {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `228`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
