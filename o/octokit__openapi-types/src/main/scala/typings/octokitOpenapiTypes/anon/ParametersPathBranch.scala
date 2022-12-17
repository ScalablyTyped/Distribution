package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranch extends StObject {
  
  var parameters: PathBranch
  
  var responses: `301404`
}
object ParametersPathBranch {
  
  inline def apply(parameters: PathBranch, responses: `301404`): ParametersPathBranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranch]
  }
  
  extension [Self <: ParametersPathBranch](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
