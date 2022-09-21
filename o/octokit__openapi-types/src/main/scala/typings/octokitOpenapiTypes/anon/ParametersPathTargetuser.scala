package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTargetuser extends StObject {
  
  var parameters: PathTargetuser
  
  var responses: `404Unknown`
}
object ParametersPathTargetuser {
  
  inline def apply(parameters: PathTargetuser, responses: `404Unknown`): ParametersPathTargetuser = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTargetuser]
  }
  
  extension [Self <: ParametersPathTargetuser](x: Self) {
    
    inline def setParameters(value: PathTargetuser): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
