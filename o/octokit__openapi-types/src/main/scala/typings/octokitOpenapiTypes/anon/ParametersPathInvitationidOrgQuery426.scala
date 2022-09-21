package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOrgQuery426 extends StObject {
  
  var parameters: PathInvitationidOrgQuery426
  
  var responses: `200Content463`
}
object ParametersPathInvitationidOrgQuery426 {
  
  inline def apply(parameters: PathInvitationidOrgQuery426, responses: `200Content463`): ParametersPathInvitationidOrgQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOrgQuery426]
  }
  
  extension [Self <: ParametersPathInvitationidOrgQuery426](x: Self) {
    
    inline def setParameters(value: PathInvitationidOrgQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content463`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
