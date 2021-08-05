package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposAcceptInvitationEndpoint extends StObject {
  
  var invitation_id: Double
}
object ReposAcceptInvitationEndpoint {
  
  inline def apply(invitation_id: Double): ReposAcceptInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAcceptInvitationEndpoint]
  }
  
  extension [Self <: ReposAcceptInvitationEndpoint](x: Self) {
    
    inline def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
