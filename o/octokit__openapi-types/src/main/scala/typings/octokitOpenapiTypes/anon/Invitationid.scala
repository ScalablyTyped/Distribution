package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitationid extends StObject {
  
  /** The unique identifier of the invitation. */
  var invitation_id: Double
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
}
object Invitationid {
  
  inline def apply(invitation_id: Double, org_ : String): Invitationid = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitationid]
  }
  
  extension [Self <: Invitationid](x: Self) {
    
    inline def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
