package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileSettings extends js.Object {
  
  var friendsListVisibility: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#profileSettings`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether the player's profile is visible to the currently signed in player. */
  var profileVisible: js.UndefOr[Boolean] = js.native
}
object ProfileSettings {
  
  @scala.inline
  def apply(): ProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileSettings]
  }
  
  @scala.inline
  implicit class ProfileSettingsOps[Self <: ProfileSettings] (val x: Self) extends AnyVal {
    
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
    def setFriendsListVisibility(value: String): Self = this.set("friendsListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendsListVisibility: Self = this.set("friendsListVisibility", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProfileVisible(value: Boolean): Self = this.set("profileVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileVisible: Self = this.set("profileVisible", js.undefined)
  }
}
