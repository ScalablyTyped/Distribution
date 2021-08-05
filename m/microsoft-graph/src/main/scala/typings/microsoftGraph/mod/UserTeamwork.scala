package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTeamwork
  extends StObject
     with Entity {
  
  // The apps installed in the personal scope of this user.
  var installedApps: js.UndefOr[NullableOption[js.Array[UserScopeTeamsAppInstallation]]] = js.undefined
}
object UserTeamwork {
  
  inline def apply(): UserTeamwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTeamwork]
  }
  
  extension [Self <: UserTeamwork](x: Self) {
    
    inline def setInstalledApps(value: NullableOption[js.Array[UserScopeTeamsAppInstallation]]): Self = StObject.set(x, "installedApps", value.asInstanceOf[js.Any])
    
    inline def setInstalledAppsNull: Self = StObject.set(x, "installedApps", null)
    
    inline def setInstalledAppsUndefined: Self = StObject.set(x, "installedApps", js.undefined)
    
    inline def setInstalledAppsVarargs(value: UserScopeTeamsAppInstallation*): Self = StObject.set(x, "installedApps", js.Array(value :_*))
  }
}
