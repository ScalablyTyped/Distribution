package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathInvitationidOrgQuery250 extends StObject {
  
  /** List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner. */
  var get: ParametersPathInvitationidOrgQuery250
}
object GetParametersPathInvitationidOrgQuery250 {
  
  inline def apply(get: ParametersPathInvitationidOrgQuery250): GetParametersPathInvitationidOrgQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathInvitationidOrgQuery250]
  }
  
  extension [Self <: GetParametersPathInvitationidOrgQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathInvitationidOrgQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
