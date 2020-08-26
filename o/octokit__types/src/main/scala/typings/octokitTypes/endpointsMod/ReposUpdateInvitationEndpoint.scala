package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.maintain
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.triage
import typings.octokitTypes.octokitTypesStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateInvitationEndpoint extends js.Object {
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
  implicit class ReposUpdateInvitationEndpointOps[Self <: ReposUpdateInvitationEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvitation_id(value: Double): Self = this.set("invitation_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: read | write | maintain | triage | admin): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
  
}

