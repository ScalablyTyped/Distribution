package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateBranchProtectionParamsRestrictions extends StObject {
  
  var apps: js.UndefOr[js.Array[String]] = js.undefined
  
  var teams: js.Array[String]
  
  var users: js.Array[String]
}
object ReposUpdateBranchProtectionParamsRestrictions {
  
  inline def apply(teams: js.Array[String], users: js.Array[String]): ReposUpdateBranchProtectionParamsRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRestrictions]
  }
  
  extension [Self <: ReposUpdateBranchProtectionParamsRestrictions](x: Self) {
    
    inline def setApps(value: js.Array[String]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: String*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
