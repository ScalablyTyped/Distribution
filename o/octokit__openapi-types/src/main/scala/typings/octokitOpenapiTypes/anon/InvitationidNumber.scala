package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationidNumber extends StObject {
  
  /** The unique identifier of the invitation. */
  var invitation_id: Double
}
object InvitationidNumber {
  
  inline def apply(invitation_id: Double): InvitationidNumber = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationidNumber]
  }
  
  extension [Self <: InvitationidNumber](x: Self) {
    
    inline def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
