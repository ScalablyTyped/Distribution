package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class UserScopeTeamsAppInstallationMutableBuilder[Self <: UserScopeTeamsAppInstallation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChat(value: NullableOption[Chat]): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatNull: Self = StObject.set(x, "chat", null)
    
    @scala.inline
    def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
  }
}
