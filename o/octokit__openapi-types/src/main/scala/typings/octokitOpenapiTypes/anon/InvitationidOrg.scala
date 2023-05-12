package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationidOrg extends StObject {
  
  var invitation_id: Double
  
  @JSName("org")
  var org_ : String
}
object InvitationidOrg {
  
  inline def apply(invitation_id: Double, org_ : String): InvitationidOrg = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvitationidOrg] (val x: Self) extends AnyVal {
    
    inline def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
