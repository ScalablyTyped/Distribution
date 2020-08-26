package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Team extends Entity {
  // The collection of channels &amp; messages associated with the team.
  var channels: js.UndefOr[js.Array[Channel]] = js.native
  // Settings to configure use of Giphy, memes, and stickers in the team.
  var funSettings: js.UndefOr[TeamFunSettings] = js.native
  // Settings to configure whether guests can create, update, or delete channels in the team.
  var guestSettings: js.UndefOr[TeamGuestSettings] = js.native
  // The apps installed in this team.
  var installedApps: js.UndefOr[js.Array[TeamsAppInstallation]] = js.native
  // Whether this team is in read-only mode.
  var isArchived: js.UndefOr[Boolean] = js.native
  /**
    * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the
    * team.
    */
  var memberSettings: js.UndefOr[TeamMemberSettings] = js.native
  // Settings to configure messaging and mentions in the team.
  var messagingSettings: js.UndefOr[TeamMessagingSettings] = js.native
  var operations: js.UndefOr[js.Array[TeamsAsyncOperation]] = js.native
  // The general channel for the team.
  var primaryChannel: js.UndefOr[Channel] = js.native
  var schedule: js.UndefOr[Schedule] = js.native
  /**
    * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a
    * team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not
    * parsed.
    */
  var webUrl: js.UndefOr[String] = js.native
}

object Team {
  @scala.inline
  def apply(): Team = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Team]
  }
  @scala.inline
  implicit class TeamOps[Self <: Team] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: Channel*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[Channel]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setFunSettings(value: TeamFunSettings): Self = this.set("funSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunSettings: Self = this.set("funSettings", js.undefined)
    @scala.inline
    def setGuestSettings(value: TeamGuestSettings): Self = this.set("guestSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuestSettings: Self = this.set("guestSettings", js.undefined)
    @scala.inline
    def setInstalledAppsVarargs(value: TeamsAppInstallation*): Self = this.set("installedApps", js.Array(value :_*))
    @scala.inline
    def setInstalledApps(value: js.Array[TeamsAppInstallation]): Self = this.set("installedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstalledApps: Self = this.set("installedApps", js.undefined)
    @scala.inline
    def setIsArchived(value: Boolean): Self = this.set("isArchived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsArchived: Self = this.set("isArchived", js.undefined)
    @scala.inline
    def setMemberSettings(value: TeamMemberSettings): Self = this.set("memberSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberSettings: Self = this.set("memberSettings", js.undefined)
    @scala.inline
    def setMessagingSettings(value: TeamMessagingSettings): Self = this.set("messagingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagingSettings: Self = this.set("messagingSettings", js.undefined)
    @scala.inline
    def setOperationsVarargs(value: TeamsAsyncOperation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[TeamsAsyncOperation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    @scala.inline
    def setPrimaryChannel(value: Channel): Self = this.set("primaryChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryChannel: Self = this.set("primaryChannel", js.undefined)
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

