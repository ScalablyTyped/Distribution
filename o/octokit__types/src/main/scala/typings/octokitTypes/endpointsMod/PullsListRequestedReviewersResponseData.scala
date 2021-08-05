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
  
  inline def apply(teams: js.Array[Membersurl], users: js.Array[Avatarurl]): PullsListRequestedReviewersResponseData = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListRequestedReviewersResponseData]
  }
  
  extension [Self <: PullsListRequestedReviewersResponseData](x: Self) {
    
    inline def setTeams(value: js.Array[Membersurl]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: Membersurl*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    inline def setUsers(value: js.Array[Avatarurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: Avatarurl*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
