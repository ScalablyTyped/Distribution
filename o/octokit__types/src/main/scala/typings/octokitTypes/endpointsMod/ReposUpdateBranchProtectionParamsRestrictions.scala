package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateBranchProtectionParamsRestrictions extends StObject {
  
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
  implicit class ReposUpdateBranchProtectionParamsRestrictionsMutableBuilder[Self <: ReposUpdateBranchProtectionParamsRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: js.Array[String]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: String*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
