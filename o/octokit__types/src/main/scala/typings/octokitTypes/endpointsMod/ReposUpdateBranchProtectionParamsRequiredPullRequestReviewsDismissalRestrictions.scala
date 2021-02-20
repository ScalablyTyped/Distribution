package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions extends StObject {
  
  var teams: js.UndefOr[js.Array[String]] = js.native
  
  var users: js.UndefOr[js.Array[String]] = js.native
}
object ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions {
  
  @scala.inline
  def apply(): ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions]
  }
  
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictionsMutableBuilder[Self <: ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    @scala.inline
    def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
