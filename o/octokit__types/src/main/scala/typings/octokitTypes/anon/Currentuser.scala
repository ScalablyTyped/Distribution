package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currentuser extends js.Object {
  var current_user: Href = js.native
  var current_user_actor: Href = js.native
  var current_user_organization: Href = js.native
  var current_user_organizations: js.Array[Href] = js.native
  var current_user_public: Href = js.native
  var security_advisories: Href = js.native
  var timeline: Href = js.native
  var user: Href = js.native
}

object Currentuser {
  @scala.inline
  def apply(
    current_user: Href,
    current_user_actor: Href,
    current_user_organization: Href,
    current_user_organizations: js.Array[Href],
    current_user_public: Href,
    security_advisories: Href,
    timeline: Href,
    user: Href
  ): Currentuser = {
    val __obj = js.Dynamic.literal(current_user = current_user.asInstanceOf[js.Any], current_user_actor = current_user_actor.asInstanceOf[js.Any], current_user_organization = current_user_organization.asInstanceOf[js.Any], current_user_organizations = current_user_organizations.asInstanceOf[js.Any], current_user_public = current_user_public.asInstanceOf[js.Any], security_advisories = security_advisories.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentuser]
  }
  @scala.inline
  implicit class CurrentuserOps[Self <: Currentuser] (val x: Self) extends AnyVal {
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
    def setCurrent_user(value: Href): Self = this.set("current_user", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent_user_actor(value: Href): Self = this.set("current_user_actor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent_user_organization(value: Href): Self = this.set("current_user_organization", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent_user_organizationsVarargs(value: Href*): Self = this.set("current_user_organizations", js.Array(value :_*))
    @scala.inline
    def setCurrent_user_organizations(value: js.Array[Href]): Self = this.set("current_user_organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent_user_public(value: Href): Self = this.set("current_user_public", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurity_advisories(value: Href): Self = this.set("security_advisories", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeline(value: Href): Self = this.set("timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Href): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

