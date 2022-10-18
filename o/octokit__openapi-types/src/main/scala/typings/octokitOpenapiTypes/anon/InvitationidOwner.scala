package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationidOwner extends StObject {
  
  /** The unique identifier of the invitation. */
  var invitation_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object InvitationidOwner {
  
  inline def apply(invitation_id: Double, owner: String, repo: String): InvitationidOwner = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationidOwner]
  }
  
  extension [Self <: InvitationidOwner](x: Self) {
    
    inline def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
