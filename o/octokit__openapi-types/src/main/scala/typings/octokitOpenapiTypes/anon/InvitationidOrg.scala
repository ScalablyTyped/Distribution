package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationidOrg extends StObject {
  
  /** The unique identifier of the invitation. */
  var invitation_id: Double
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
}
object InvitationidOrg {
  
  inline def apply(invitation_id: Double, org_ : String): InvitationidOrg = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationidOrg]
  }
  
  extension [Self <: InvitationidOrg](x: Self) {
    
    inline def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
