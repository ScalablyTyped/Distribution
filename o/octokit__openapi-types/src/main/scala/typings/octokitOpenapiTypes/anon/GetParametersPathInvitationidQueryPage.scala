package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathInvitationidQueryPage extends StObject {
  
  /** List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner. */
  var get: ParametersPathInvitationidQueryPage
}
object GetParametersPathInvitationidQueryPage {
  
  inline def apply(get: ParametersPathInvitationidQueryPage): GetParametersPathInvitationidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathInvitationidQueryPage]
  }
  
  extension [Self <: GetParametersPathInvitationidQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathInvitationidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
