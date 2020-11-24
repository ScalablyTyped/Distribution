package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamGuestSettings extends js.Object {
  
  // If set to true, guests can add and update channels.
  var allowCreateUpdateChannels: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, guests can delete channels.
  var allowDeleteChannels: js.UndefOr[NullableOption[Boolean]] = js.native
}
object TeamGuestSettings {
  
  @scala.inline
  def apply(): TeamGuestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamGuestSettings]
  }
  
  @scala.inline
  implicit class TeamGuestSettingsOps[Self <: TeamGuestSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowCreateUpdateChannels(value: NullableOption[Boolean]): Self = this.set("allowCreateUpdateChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCreateUpdateChannels: Self = this.set("allowCreateUpdateChannels", js.undefined)
    
    @scala.inline
    def setAllowCreateUpdateChannelsNull: Self = this.set("allowCreateUpdateChannels", null)
    
    @scala.inline
    def setAllowDeleteChannels(value: NullableOption[Boolean]): Self = this.set("allowDeleteChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteChannels: Self = this.set("allowDeleteChannels", js.undefined)
    
    @scala.inline
    def setAllowDeleteChannelsNull: Self = this.set("allowDeleteChannels", null)
  }
}
