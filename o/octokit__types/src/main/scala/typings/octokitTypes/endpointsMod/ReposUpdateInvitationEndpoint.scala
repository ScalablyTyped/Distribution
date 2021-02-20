package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.maintain
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.triage
import typings.octokitTypes.octokitTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateInvitationEndpoint extends StObject {
  
  var invitation_id: Double = js.native
  
  var owner: String = js.native
  
  /**
    * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.
    */
  var permissions: js.UndefOr[read | write | maintain | triage | admin] = js.native
  
  var repo: String = js.native
}
object ReposUpdateInvitationEndpoint {
  
  @scala.inline
  def apply(invitation_id: Double, owner: String, repo: String): ReposUpdateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateInvitationEndpointMutableBuilder[Self <: ReposUpdateInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitation_id(value: Double): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: read | write | maintain | triage | admin): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
