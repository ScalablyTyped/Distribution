package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamMessagingSettings extends js.Object {
  // If set to true, @channel mentions are allowed.
  var allowChannelMentions: js.UndefOr[Boolean] = js.native
  // If set to true, owners can delete any message.
  var allowOwnerDeleteMessages: js.UndefOr[Boolean] = js.native
  // If set to true, @team mentions are allowed.
  var allowTeamMentions: js.UndefOr[Boolean] = js.native
  // If set to true, users can delete their messages.
  var allowUserDeleteMessages: js.UndefOr[Boolean] = js.native
  // If set to true, users can edit their messages.
  var allowUserEditMessages: js.UndefOr[Boolean] = js.native
}

object TeamMessagingSettings {
  @scala.inline
  def apply(): TeamMessagingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamMessagingSettings]
  }
  @scala.inline
  implicit class TeamMessagingSettingsOps[Self <: TeamMessagingSettings] (val x: Self) extends AnyVal {
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
    def setAllowChannelMentions(value: Boolean): Self = this.set("allowChannelMentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowChannelMentions: Self = this.set("allowChannelMentions", js.undefined)
    @scala.inline
    def setAllowOwnerDeleteMessages(value: Boolean): Self = this.set("allowOwnerDeleteMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOwnerDeleteMessages: Self = this.set("allowOwnerDeleteMessages", js.undefined)
    @scala.inline
    def setAllowTeamMentions(value: Boolean): Self = this.set("allowTeamMentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTeamMentions: Self = this.set("allowTeamMentions", js.undefined)
    @scala.inline
    def setAllowUserDeleteMessages(value: Boolean): Self = this.set("allowUserDeleteMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUserDeleteMessages: Self = this.set("allowUserDeleteMessages", js.undefined)
    @scala.inline
    def setAllowUserEditMessages(value: Boolean): Self = this.set("allowUserEditMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUserEditMessages: Self = this.set("allowUserEditMessages", js.undefined)
  }
  
}

