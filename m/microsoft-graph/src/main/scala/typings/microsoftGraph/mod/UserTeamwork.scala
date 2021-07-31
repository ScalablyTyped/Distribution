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
  
  @scala.inline
  def apply(): UserTeamwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTeamwork]
  }
  
  @scala.inline
  implicit class UserTeamworkMutableBuilder[Self <: UserTeamwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstalledApps(value: NullableOption[js.Array[UserScopeTeamsAppInstallation]]): Self = StObject.set(x, "installedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledAppsNull: Self = StObject.set(x, "installedApps", null)
    
    @scala.inline
    def setInstalledAppsUndefined: Self = StObject.set(x, "installedApps", js.undefined)
    
    @scala.inline
    def setInstalledAppsVarargs(value: UserScopeTeamsAppInstallation*): Self = StObject.set(x, "installedApps", js.Array(value :_*))
  }
}
