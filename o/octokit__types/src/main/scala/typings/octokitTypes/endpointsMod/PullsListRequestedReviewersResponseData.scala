package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Membersurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsListRequestedReviewersResponseData extends StObject {
  
  var teams: js.Array[Membersurl]
  
  var users: js.Array[Avatarurl]
}
object PullsListRequestedReviewersResponseData {
  
  @scala.inline
  def apply(teams: js.Array[Membersurl], users: js.Array[Avatarurl]): PullsListRequestedReviewersResponseData = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListRequestedReviewersResponseData]
  }
  
  @scala.inline
  implicit class PullsListRequestedReviewersResponseDataMutableBuilder[Self <: PullsListRequestedReviewersResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeams(value: js.Array[Membersurl]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: Membersurl*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[Avatarurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Avatarurl*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
