package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationidOwnerRepo extends StObject {
  
  var invitation_id: Double
  
  var owner: String
  
  var repo: String
}
object InvitationidOwnerRepo {
  
  inline def apply(invitation_id: Double, owner: String, repo: String): InvitationidOwnerRepo = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvitationidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
