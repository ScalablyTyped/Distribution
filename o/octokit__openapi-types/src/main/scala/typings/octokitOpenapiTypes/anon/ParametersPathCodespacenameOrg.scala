package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCodespacenameOrg extends StObject {
  
  var parameters: PathCodespacenameOrg
  
  var responses: `202304401`
}
object ParametersPathCodespacenameOrg {
  
  inline def apply(parameters: PathCodespacenameOrg, responses: `202304401`): ParametersPathCodespacenameOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCodespacenameOrg]
  }
  
  extension [Self <: ParametersPathCodespacenameOrg](x: Self) {
    
    inline def setParameters(value: PathCodespacenameOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
