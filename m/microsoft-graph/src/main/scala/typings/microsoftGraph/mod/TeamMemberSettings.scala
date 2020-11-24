package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamMemberSettings extends js.Object {
  
  // If set to true, members can add and remove apps.
  var allowAddRemoveApps: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, members can add and update private channels.
  var allowCreatePrivateChannels: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, members can add and update channels.
  var allowCreateUpdateChannels: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, members can add, update, and remove connectors.
  var allowCreateUpdateRemoveConnectors: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, members can add, update, and remove tabs.
  var allowCreateUpdateRemoveTabs: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, members can delete channels.
  var allowDeleteChannels: js.UndefOr[NullableOption[Boolean]] = js.native
}
object TeamMemberSettings {
  
  @scala.inline
  def apply(): TeamMemberSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMemberSettings]
  }
  
  @scala.inline
  implicit class TeamMemberSettingsOps[Self <: TeamMemberSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowAddRemoveApps(value: NullableOption[Boolean]): Self = this.set("allowAddRemoveApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAddRemoveApps: Self = this.set("allowAddRemoveApps", js.undefined)
    
    @scala.inline
    def setAllowAddRemoveAppsNull: Self = this.set("allowAddRemoveApps", null)
    
    @scala.inline
    def setAllowCreatePrivateChannels(value: NullableOption[Boolean]): Self = this.set("allowCreatePrivateChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCreatePrivateChannels: Self = this.set("allowCreatePrivateChannels", js.undefined)
    
    @scala.inline
    def setAllowCreatePrivateChannelsNull: Self = this.set("allowCreatePrivateChannels", null)
    
    @scala.inline
    def setAllowCreateUpdateChannels(value: NullableOption[Boolean]): Self = this.set("allowCreateUpdateChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCreateUpdateChannels: Self = this.set("allowCreateUpdateChannels", js.undefined)
    
    @scala.inline
    def setAllowCreateUpdateChannelsNull: Self = this.set("allowCreateUpdateChannels", null)
    
    @scala.inline
    def setAllowCreateUpdateRemoveConnectors(value: NullableOption[Boolean]): Self = this.set("allowCreateUpdateRemoveConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCreateUpdateRemoveConnectors: Self = this.set("allowCreateUpdateRemoveConnectors", js.undefined)
    
    @scala.inline
    def setAllowCreateUpdateRemoveConnectorsNull: Self = this.set("allowCreateUpdateRemoveConnectors", null)
    
    @scala.inline
    def setAllowCreateUpdateRemoveTabs(value: NullableOption[Boolean]): Self = this.set("allowCreateUpdateRemoveTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCreateUpdateRemoveTabs: Self = this.set("allowCreateUpdateRemoveTabs", js.undefined)
    
    @scala.inline
    def setAllowCreateUpdateRemoveTabsNull: Self = this.set("allowCreateUpdateRemoveTabs", null)
    
    @scala.inline
    def setAllowDeleteChannels(value: NullableOption[Boolean]): Self = this.set("allowDeleteChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteChannels: Self = this.set("allowDeleteChannels", js.undefined)
    
    @scala.inline
    def setAllowDeleteChannelsNull: Self = this.set("allowDeleteChannels", null)
  }
}
