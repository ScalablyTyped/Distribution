package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOrgQuery250 extends StObject {
  
  var parameters: PathInvitationidOrgQuery250
  
  var responses: `200Content341`
}
object ParametersPathInvitationidOrgQuery250 {
  
  inline def apply(parameters: PathInvitationidOrgQuery250, responses: `200Content341`): ParametersPathInvitationidOrgQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOrgQuery250]
  }
  
  extension [Self <: ParametersPathInvitationidOrgQuery250](x: Self) {
    
    inline def setParameters(value: PathInvitationidOrgQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content341`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
