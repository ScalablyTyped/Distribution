package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTeamwork
  extends StObject
     with Entity {
  
  // The list of associatedTeamInfo objects that a user is associated with.
  var associatedTeams: js.UndefOr[NullableOption[js.Array[AssociatedTeamInfo]]] = js.undefined
  
  // The apps installed in the personal scope of this user.
  var installedApps: js.UndefOr[NullableOption[js.Array[UserScopeTeamsAppInstallation]]] = js.undefined
}
object UserTeamwork {
  
  inline def apply(): UserTeamwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTeamwork]
  }
  
  extension [Self <: UserTeamwork](x: Self) {
    
    inline def setAssociatedTeams(value: NullableOption[js.Array[AssociatedTeamInfo]]): Self = StObject.set(x, "associatedTeams", value.asInstanceOf[js.Any])
    
    inline def setAssociatedTeamsNull: Self = StObject.set(x, "associatedTeams", null)
    
    inline def setAssociatedTeamsUndefined: Self = StObject.set(x, "associatedTeams", js.undefined)
    
    inline def setAssociatedTeamsVarargs(value: AssociatedTeamInfo*): Self = StObject.set(x, "associatedTeams", js.Array(value*))
    
    inline def setInstalledApps(value: NullableOption[js.Array[UserScopeTeamsAppInstallation]]): Self = StObject.set(x, "installedApps", value.asInstanceOf[js.Any])
    
    inline def setInstalledAppsNull: Self = StObject.set(x, "installedApps", null)
    
    inline def setInstalledAppsUndefined: Self = StObject.set(x, "installedApps", js.undefined)
    
    inline def setInstalledAppsVarargs(value: UserScopeTeamsAppInstallation*): Self = StObject.set(x, "installedApps", js.Array(value*))
  }
}
