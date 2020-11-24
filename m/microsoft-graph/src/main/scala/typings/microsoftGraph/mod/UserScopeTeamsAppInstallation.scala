package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserScopeTeamsAppInstallation extends TeamsAppInstallation {
  
  var chat: js.UndefOr[NullableOption[Chat]] = js.native
}
object UserScopeTeamsAppInstallation {
  
  @scala.inline
  def apply(): UserScopeTeamsAppInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserScopeTeamsAppInstallation]
  }
  
  @scala.inline
  implicit class UserScopeTeamsAppInstallationOps[Self <: UserScopeTeamsAppInstallation] (val x: Self) extends AnyVal {
    
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
    def setChat(value: NullableOption[Chat]): Self = this.set("chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChat: Self = this.set("chat", js.undefined)
    
    @scala.inline
    def setChatNull: Self = this.set("chat", null)
  }
}
