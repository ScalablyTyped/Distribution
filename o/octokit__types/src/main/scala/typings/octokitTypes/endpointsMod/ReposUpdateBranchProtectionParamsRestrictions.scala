package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionParamsRestrictions extends js.Object {
  var apps: js.UndefOr[js.Array[String]] = js.native
  var teams: js.Array[String] = js.native
  var users: js.Array[String] = js.native
}

object ReposUpdateBranchProtectionParamsRestrictions {
  @scala.inline
  def apply(teams: js.Array[String], users: js.Array[String]): ReposUpdateBranchProtectionParamsRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRestrictions]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRestrictionsOps[Self <: ReposUpdateBranchProtectionParamsRestrictions] (val x: Self) extends AnyVal {
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
    def setTeamsVarargs(value: String*): Self = this.set("teams", js.Array(value :_*))
    @scala.inline
    def setTeams(value: js.Array[String]): Self = this.set("teams", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppsVarargs(value: String*): Self = this.set("apps", js.Array(value :_*))
    @scala.inline
    def setApps(value: js.Array[String]): Self = this.set("apps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
  }
  
}

