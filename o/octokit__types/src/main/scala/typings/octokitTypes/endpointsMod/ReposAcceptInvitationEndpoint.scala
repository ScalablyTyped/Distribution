package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposAcceptInvitationEndpoint extends StObject {
  
  var invitation_id: Double = js.native
}
object ReposAcceptInvitationEndpoint {
  
  @scala.inline
  def apply(invitation_id: Double): ReposAcceptInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAcceptInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ReposAcceptInvitationEndpointMutableBuilder[Self <: ReposAcceptInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
