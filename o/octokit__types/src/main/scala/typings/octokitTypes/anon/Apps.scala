package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apps extends js.Object {
  var apps: js.Array[Events] = js.native
  var apps_url: String = js.native
  var teams: js.Array[Membersurl] = js.native
  var teams_url: String = js.native
  var url: String = js.native
  var users: js.Array[Avatarurl] = js.native
  var users_url: String = js.native
}

object Apps {
  @scala.inline
  def apply(
    apps: js.Array[Events],
    apps_url: String,
    teams: js.Array[Membersurl],
    teams_url: String,
    url: String,
    users: js.Array[Avatarurl],
    users_url: String
  ): Apps = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apps]
  }
  @scala.inline
  implicit class AppsOps[Self <: Apps] (val x: Self) extends AnyVal {
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
    def setAppsVarargs(value: Events*): Self = this.set("apps", js.Array(value :_*))
    @scala.inline
    def setApps(value: js.Array[Events]): Self = this.set("apps", value.asInstanceOf[js.Any])
    @scala.inline
    def setApps_url(value: String): Self = this.set("apps_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamsVarargs(value: Membersurl*): Self = this.set("teams", js.Array(value :_*))
    @scala.inline
    def setTeams(value: js.Array[Membersurl]): Self = this.set("teams", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeams_url(value: String): Self = this.set("teams_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: Avatarurl*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[Avatarurl]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsers_url(value: String): Self = this.set("users_url", value.asInstanceOf[js.Any])
  }
  
}

