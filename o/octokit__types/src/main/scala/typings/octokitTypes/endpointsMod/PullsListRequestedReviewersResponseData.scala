package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Membersurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsListRequestedReviewersResponseData extends js.Object {
  
  var teams: js.Array[Membersurl] = js.native
  
  var users: js.Array[Avatarurl] = js.native
}
object PullsListRequestedReviewersResponseData {
  
  @scala.inline
  def apply(teams: js.Array[Membersurl], users: js.Array[Avatarurl]): PullsListRequestedReviewersResponseData = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListRequestedReviewersResponseData]
  }
  
  @scala.inline
  implicit class PullsListRequestedReviewersResponseDataOps[Self <: PullsListRequestedReviewersResponseData] (val x: Self) extends AnyVal {
    
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
    def setTeamsVarargs(value: Membersurl*): Self = this.set("teams", js.Array(value :_*))
    
    @scala.inline
    def setTeams(value: js.Array[Membersurl]): Self = this.set("teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Avatarurl*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[Avatarurl]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
