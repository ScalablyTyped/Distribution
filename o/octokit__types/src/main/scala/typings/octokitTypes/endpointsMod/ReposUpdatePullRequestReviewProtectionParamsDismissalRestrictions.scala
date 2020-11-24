package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions extends js.Object {
  
  var teams: js.UndefOr[js.Array[String]] = js.native
  
  var users: js.UndefOr[js.Array[String]] = js.native
}
object ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions {
  
  @scala.inline
  def apply(): ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions]
  }
  
  @scala.inline
  implicit class ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictionsOps[Self <: ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions] (val x: Self) extends AnyVal {
    
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
    def deleteTeams: Self = this.set("teams", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
