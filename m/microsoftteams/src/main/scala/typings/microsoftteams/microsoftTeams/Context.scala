package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  /**
    * The Microsoft Teams ID for the channel with which the content is associated.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The name for the channel with which the content is associated.
    */
  var channelName: js.UndefOr[String] = js.native
  
  /**
    * The developer-defined unique ID for the entity this content points to.
    */
  var entityId: String = js.native
  
  /**
    * The Office 365 group ID for the team with which the content is associated.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var groupId: js.UndefOr[String] = js.native
  
  /**
    * Indication whether the tab is in full-screen mode.
    */
  var isFullScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * The current locale that the user has configured for the app formatted as
    * languageId-countryId (for example, en-us).
    */
  var locale: String = js.native
  
  /**
    * The developer-defined unique ID for the sub-entity this content points to.
    * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: js.UndefOr[String] = js.native
  
  /**
    * The Microsoft Teams ID for the team with which the content is associated.
    */
  var teamId: js.UndefOr[String] = js.native
  
  /**
    * The name for the team with which the content is associated.
    */
  var teamName: js.UndefOr[String] = js.native
  
  /**
    * The type of the team.
    */
  var teamType: js.UndefOr[TeamType] = js.native
  
  /**
    * The current UI theme.
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * The Azure AD tenant ID of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var tid: js.UndefOr[String] = js.native
  
  /**
    * The UPN of the current user.
    * Because a malicious party can host malicious content in a browser, this value should
    * be used only as a hint as to who the user is and never as proof of identity.
    * This field is available only when the identity permission is requested in the manifest.
    */
  var upn: js.UndefOr[String] = js.native
}
object Context {
  
  @scala.inline
  def apply(entityId: String, locale: String): Context = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setIsFullScreen(value: Boolean): Self = this.set("isFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFullScreen: Self = this.set("isFullScreen", js.undefined)
    
    @scala.inline
    def setSubEntityId(value: String): Self = this.set("subEntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubEntityId: Self = this.set("subEntityId", js.undefined)
    
    @scala.inline
    def setTeamId(value: String): Self = this.set("teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamId: Self = this.set("teamId", js.undefined)
    
    @scala.inline
    def setTeamName(value: String): Self = this.set("teamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamName: Self = this.set("teamName", js.undefined)
    
    @scala.inline
    def setTeamType(value: TeamType): Self = this.set("teamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamType: Self = this.set("teamType", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTid(value: String): Self = this.set("tid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTid: Self = this.set("tid", js.undefined)
    
    @scala.inline
    def setUpn(value: String): Self = this.set("upn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpn: Self = this.set("upn", js.undefined)
  }
}
