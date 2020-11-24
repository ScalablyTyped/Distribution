package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabInstance extends js.Object {
  
  var channelId: js.UndefOr[String] = js.native
  
  var channelIsFavorite: js.UndefOr[Boolean] = js.native
  
  var channelName: js.UndefOr[String] = js.native
  
  var entityId: js.UndefOr[String] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var internalTabInstanceId: js.UndefOr[String] = js.native
  
  var lastViewUnixEpochTime: js.UndefOr[String] = js.native
  
  var tabName: String = js.native
  
  var teamId: js.UndefOr[String] = js.native
  
  var teamIsFavorite: js.UndefOr[Boolean] = js.native
  
  var teamName: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var websiteUrl: js.UndefOr[String] = js.native
}
object TabInstance {
  
  @scala.inline
  def apply(tabName: String): TabInstance = {
    val __obj = js.Dynamic.literal(tabName = tabName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInstance]
  }
  
  @scala.inline
  implicit class TabInstanceOps[Self <: TabInstance] (val x: Self) extends AnyVal {
    
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
    def setTabName(value: String): Self = this.set("tabName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setChannelIsFavorite(value: Boolean): Self = this.set("channelIsFavorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelIsFavorite: Self = this.set("channelIsFavorite", js.undefined)
    
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setInternalTabInstanceId(value: String): Self = this.set("internalTabInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalTabInstanceId: Self = this.set("internalTabInstanceId", js.undefined)
    
    @scala.inline
    def setLastViewUnixEpochTime(value: String): Self = this.set("lastViewUnixEpochTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastViewUnixEpochTime: Self = this.set("lastViewUnixEpochTime", js.undefined)
    
    @scala.inline
    def setTeamId(value: String): Self = this.set("teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamId: Self = this.set("teamId", js.undefined)
    
    @scala.inline
    def setTeamIsFavorite(value: Boolean): Self = this.set("teamIsFavorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamIsFavorite: Self = this.set("teamIsFavorite", js.undefined)
    
    @scala.inline
    def setTeamName(value: String): Self = this.set("teamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamName: Self = this.set("teamName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
