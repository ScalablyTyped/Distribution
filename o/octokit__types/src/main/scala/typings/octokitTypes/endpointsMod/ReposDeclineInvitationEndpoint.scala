package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeclineInvitationEndpoint extends StObject {
  
  var invitation_id: Double
}
object ReposDeclineInvitationEndpoint {
  
  @scala.inline
  def apply(invitation_id: Double): ReposDeclineInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeclineInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeclineInvitationEndpointMutableBuilder[Self <: ReposDeclineInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
