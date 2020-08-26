package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitee extends js.Object {
  var created_at: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var invitee: Avatarurl = js.native
  var inviter: Avatarurl = js.native
  var permissions: String = js.native
  var repository: Archiveurl = js.native
  var url: String = js.native
}

object Invitee {
  @scala.inline
  def apply(
    created_at: String,
    html_url: String,
    id: Double,
    invitee: Avatarurl,
    inviter: Avatarurl,
    permissions: String,
    repository: Archiveurl,
    url: String
  ): Invitee = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitee]
  }
  @scala.inline
  implicit class InviteeOps[Self <: Invitee] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvitee(value: Avatarurl): Self = this.set("invitee", value.asInstanceOf[js.Any])
    @scala.inline
    def setInviter(value: Avatarurl): Self = this.set("inviter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: String): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: Archiveurl): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

