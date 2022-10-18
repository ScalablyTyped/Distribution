package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberOwnerResponses236 extends StObject {
  
  var parameters: PathMilestonenumberOwner
  
  var responses: `236`
}
object ParametersPathMilestonenumberOwnerResponses236 {
  
  inline def apply(parameters: PathMilestonenumberOwner, responses: `236`): ParametersPathMilestonenumberOwnerResponses236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberOwnerResponses236]
  }
  
  extension [Self <: ParametersPathMilestonenumberOwnerResponses236](x: Self) {
    
    inline def setParameters(value: PathMilestonenumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
