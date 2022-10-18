package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOrg extends StObject {
  
  var parameters: PathInvitationidOrg
  
  var responses: `340`
}
object ParametersPathInvitationidOrg {
  
  inline def apply(parameters: PathInvitationidOrg, responses: `340`): ParametersPathInvitationidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOrg]
  }
  
  extension [Self <: ParametersPathInvitationidOrg](x: Self) {
    
    inline def setParameters(value: PathInvitationidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `340`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
