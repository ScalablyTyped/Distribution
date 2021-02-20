package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamGuestSettings extends StObject {
  
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
  implicit class TeamGuestSettingsMutableBuilder[Self <: TeamGuestSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCreateUpdateChannels(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCreateUpdateChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCreateUpdateChannelsNull: Self = StObject.set(x, "allowCreateUpdateChannels", null)
    
    @scala.inline
    def setAllowCreateUpdateChannelsUndefined: Self = StObject.set(x, "allowCreateUpdateChannels", js.undefined)
    
    @scala.inline
    def setAllowDeleteChannels(value: NullableOption[Boolean]): Self = StObject.set(x, "allowDeleteChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeleteChannelsNull: Self = StObject.set(x, "allowDeleteChannels", null)
    
    @scala.inline
    def setAllowDeleteChannelsUndefined: Self = StObject.set(x, "allowDeleteChannels", js.undefined)
  }
}
