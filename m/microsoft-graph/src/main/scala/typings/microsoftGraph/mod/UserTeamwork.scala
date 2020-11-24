package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserTeamwork extends Entity {
  
  // The apps installed in the personal scope of this user.
  var installedApps: js.UndefOr[NullableOption[js.Array[UserScopeTeamsAppInstallation]]] = js.native
}
object UserTeamwork {
  
  @scala.inline
  def apply(): UserTeamwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTeamwork]
  }
  
  @scala.inline
  implicit class UserTeamworkOps[Self <: UserTeamwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstalledAppsVarargs(value: UserScopeTeamsAppInstallation*): Self = this.set("installedApps", js.Array(value :_*))
    
    @scala.inline
    def setInstalledApps(value: NullableOption[js.Array[UserScopeTeamsAppInstallation]]): Self = this.set("installedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledApps: Self = this.set("installedApps", js.undefined)
    
    @scala.inline
    def setInstalledAppsNull: Self = this.set("installedApps", null)
  }
}
