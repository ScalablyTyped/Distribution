package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions extends StObject {
  
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
  implicit class ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictionsMutableBuilder[Self <: ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions] (val x: Self) extends AnyVal {
    
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
