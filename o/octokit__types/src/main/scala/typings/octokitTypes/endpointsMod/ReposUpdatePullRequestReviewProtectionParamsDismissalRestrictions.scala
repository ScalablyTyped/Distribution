package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions extends StObject {
  
  var teams: js.UndefOr[js.Array[String]] = js.undefined
  
  var users: js.UndefOr[js.Array[String]] = js.undefined
}
object ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions {
  
  inline def apply(): ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions]
  }
  
  extension [Self <: ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions](x: Self) {
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
